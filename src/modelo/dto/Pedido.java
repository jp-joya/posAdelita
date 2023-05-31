package modelo.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

public class Pedido implements Serializable{
	
	private ArrayList<Orden> ordenes;
	
	public Pedido(){
		this.ordenes = new ArrayList<Orden>();
	}
	
	public void agregarOrden(Producto producto, int cantidad) {
		Orden orden = new Orden(producto, cantidad);
		ordenes.add(orden);
	}

	@Override
	public String toString() {
		String list = Arrays.toString(ordenes.toArray()).replace("[", "").replace("]", "").replace(",", "");
		return list;
	}

	
	
}
