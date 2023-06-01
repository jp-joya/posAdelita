package modelo.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Pedido implements Serializable{
	
	private ArrayList<Orden> ordenes;
	LocalDateTime fecha;
	
	public Pedido(){
		this.ordenes = new ArrayList<Orden>();
	}
	
	public void agregarOrden(Producto producto, int cantidad) {
		Orden orden=null;
		boolean nuevo=true;
		if(!ordenes.isEmpty()) {
			for (Orden o: ordenes) {
				if(o.getProducto().getCodigo()==producto.getCodigo()) {
					o.setCantidad(o.getCantidad()+1);
					nuevo = false;
				}else {
					orden = new Orden(producto, cantidad);
				}
			}

		}else{
		 orden = new Orden(producto, cantidad);
		}
		
		if(nuevo) {
			ordenes.add(orden);
		}
		
	}
	


	@Override
	public String toString() {
		String list = " " + Arrays.toString(ordenes.toArray()).replace("[", "").replace("]", "").replace(",", "");
		return list;
	}

	public ArrayList<Orden> getOrdenes() {
		return ordenes;
	}
	
	public int calcularTotal () {
		int total=0;
		for(Orden orden: ordenes) {
			total += orden.getProducto().getPrecio() * orden.getCantidad();
		}
		return total;
	}
	public int calcularCantidad() {
		int cantidadTotalProductos = 0;
		for (Orden orden : ordenes) {
			cantidadTotalProductos += orden.getCantidad();
		}
		return cantidadTotalProductos;
	}
	
	public void setFecha(LocalDateTime localDateTime) {
		this.fecha = localDateTime;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}
	
	public String formarFecha(LocalDateTime fecha) {
		DateTimeFormatter fechaF = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		String fechas = fecha.format(fechaF);
		return fechas;
	}
	

	
	
	
	
	
}
