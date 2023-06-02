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
		boolean existeOrden = false;

        for (Orden orden : ordenes) {
            if (orden.getProducto().getCodigo() == producto.getCodigo()) {
                orden.setCantidad(orden.getCantidad() + cantidad);
                existeOrden = true;
                break;
            }
        }

        if (!existeOrden) {
            Orden nuevaOrden = new Orden(producto, cantidad);
            ordenes.add(nuevaOrden);
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
