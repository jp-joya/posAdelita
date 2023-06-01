package modelo.dto;

import java.io.Serializable;

public class Orden implements Serializable{
	Producto producto;
	private int cantidad;
	
	public Orden(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return producto + "/" + cantidad + "\n";
	}
	
	
	
}
