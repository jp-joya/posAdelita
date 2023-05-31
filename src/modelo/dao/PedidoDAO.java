package modelo.dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

import modelo.dto.Orden;
import modelo.dto.Pedido;
import modelo.dto.Producto;

public class PedidoDAO {
	
	private ArrayList<Pedido> listaPedidos;
	public ObjectInputStream entrada;
    public ObjectOutputStream salida;
    private String filePath = "historial.txt";
    private Pedido pedido;
	
	
	public PedidoDAO() {
		this.listaPedidos = new ArrayList<Pedido>();
		File file = new File(filePath);
		if (file.isFile()) {
			try {
				this.entrada = new ObjectInputStream(new FileInputStream("historial.txt"));
				this.listaPedidos = (ArrayList<Pedido>) entrada.readObject();
				this.entrada.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				guardar();
			}
		}
	}

	public boolean crear(Pedido pedido) {
		return listaPedidos.add(pedido);	
	}
	public void guardar() {
		try {
			this.salida = new ObjectOutputStream(new FileOutputStream("historial.txt"));
			this.salida.writeObject(listaPedidos);
			this.salida.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	
	public ArrayList<Pedido> getListaPedidos() {
		return listaPedidos;
	}

	@Override
	public String toString() {
		String list = Arrays.toString(listaPedidos.toArray()).replace("[", "").replace("]", "").replace(",", "") + "\n";
		return list;
	}
	
	
}
