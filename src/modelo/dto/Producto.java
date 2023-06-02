package modelo.dto;

import java.io.Serializable;

public class Producto implements Serializable{
	private int codigo;
	private String nombre;
	private int precio;
    private int cantidadVendida;

	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return nombre + "	/	" + precio;
	}
	
	public void incrementarCantidadVendida(int cantidad) {
		this.cantidadVendida += cantidad;
	}
	public int getCantidadVendida() {
		return cantidadVendida;
	}
	
}
