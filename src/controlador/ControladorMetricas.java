package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

import modelo.dao.PedidoDAO;
import modelo.dao.ProductoDAO;
import modelo.dto.Orden;
import modelo.dto.Pedido;
import modelo.dto.Producto;
import vista.UIMetricas;
import vista.UIPedido;

public class ControladorMetricas implements ActionListener{
	private UIMetricas vista;
	private PedidoDAO modelo;
	private ProductoDAO catalogo;

	public ControladorMetricas(UIMetricas vista) {
		this.vista = vista;
		this.catalogo = new ProductoDAO();
		this.modelo = new PedidoDAO();
		this.vista.obtener.addActionListener(this);
		this.vista.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.vista.obtener) {
			metricasProductos();
		}
	}
	
	public void metricasProductos() {
		masVendidos();
		vista.txtTotal.setText(String.valueOf(ventasTotales()));
		vista.txtDia.setText(diaPico());
	}
	
	public void masVendidos() {
	    catalogo.getCatalogo().sort((a, b) -> Integer.compare(b.getCantidadVendida(), a.getCantidadVendida()));
	    int filas = vista.modelMejores.getRowCount();
		for(int i=0;filas>i;i++) {
			vista.modelMejores.removeRow(0);
		}
	    for (Producto producto : catalogo.getCatalogo()) {
	    	Object[] fila =new Object[3];
			fila[0] = producto.getCodigo();
			fila[1] = producto.getNombre();
			fila[2] = producto.getCantidadVendida();
			vista.modelMejores.addRow(fila);
	    }
	}	
	public String diaPico() {
		 int[] contadorDiasSemana = new int[DayOfWeek.values().length];
		 for (Pedido pedido : modelo.getListaPedidos()) {
	            DayOfWeek diaSemana = pedido.getFecha().getDayOfWeek();
	            int indiceDiaSemana = diaSemana.getValue() - 1;
	            contadorDiasSemana[indiceDiaSemana]++;
	        }
		 int maxContador = 0;
	        DayOfWeek diaMasRepetido = null;
	        for (DayOfWeek diaSemana : DayOfWeek.values()) {
	            int indiceDiaSemana = diaSemana.getValue() - 1;
	            int contador = contadorDiasSemana[indiceDiaSemana];
	            if (contador > maxContador) {
	                maxContador = contador;
	                diaMasRepetido = diaSemana;
	            }
	        }
	        String dMasR="";
	        switch(diaMasRepetido) {
	        case MONDAY: dMasR = "Lunes";break;
	        case TUESDAY: dMasR = "Martes"; break;
	        case WEDNESDAY: dMasR = "Miercoles"; break;
	        case THURSDAY: dMasR = "Jueves"; break;
	        case FRIDAY: dMasR = "Viernes"; break;
	        case SATURDAY: dMasR = "Sabado"; break;
	        case SUNDAY: dMasR = "Domingo"; break;
	        }
	        return dMasR;
	}
	public int ventasTotales() {
		int total =0;
		for(Pedido pedido:modelo.getListaPedidos()) {
			total += pedido.calcularTotal();
		}
		return total;
	}
	
	
	
}
