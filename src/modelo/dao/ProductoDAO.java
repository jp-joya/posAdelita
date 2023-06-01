package modelo.dao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.dto.Producto;

public class ProductoDAO{
	
	private ArrayList<Producto> catalogo;
	public ObjectInputStream entrada;
    public ObjectOutputStream salida;
    private String filePath = "catalogo.dat";
	
	public ProductoDAO() {
		this.catalogo = new ArrayList<Producto>();
		File file = new File(filePath);
		if (file.isFile()) {
			try {
				this.entrada = new ObjectInputStream(new FileInputStream("catalogo.dat"));
				this.catalogo = (ArrayList<Producto>) entrada.readObject();
				this.entrada.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
				guardar();
			}
		}
	}
	
	public boolean crear(Producto producto) {
		return catalogo.add(producto);	
	}
	
	public Producto consultar(int codigo) {
		Producto producto = null;
		for (Producto p :catalogo) {
			if (p.getCodigo()==codigo) {
				producto=p;
				break;
			}			
		}
		return producto;
	}
	
	public void guardar() {
		try {
			this.salida = new ObjectOutputStream(new FileOutputStream("catalogo.dat"));
			this.salida.writeObject(catalogo);
			this.salida.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public ArrayList<Producto> getCatalogo() {
		return catalogo;
	}
	
	
}

