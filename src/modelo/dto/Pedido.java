package modelo.dto;

import java.util.ArrayList;

public class Pedido {
	
	private int numero = 1;
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
		return "Pedido #" + numero + ": \n" + ordenes;
	}

	public int getNumero() {
		return numero;
	}

	public ArrayList<Orden> getOrdenes() {
		return ordenes;
	}
	
	
}
