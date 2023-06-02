package controlador;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.swing.JButton;
import javax.swing.JOptionPane;

import modelo.dao.PedidoDAO;
import modelo.dao.ProductoDAO;
import modelo.dto.Orden;
import modelo.dto.Pedido;
import modelo.dto.Producto;
import vista.UIPedido;

public class ControladorPedido implements ActionListener {
	private UIPedido vista;
	private PedidoDAO modelo;
	private ProductoDAO catalogo;
	private Pedido pedido;
	JButton[] botones=new JButton[15];
	
	 
	public ControladorPedido(UIPedido vista) {
		this.vista = vista;
		this.modelo = new PedidoDAO();
		this.catalogo = new ProductoDAO();
		this.pedido = new Pedido();
		
		filtrarProductos();
		this.vista.facturar.addActionListener(this);
		this.vista.salir.addActionListener(this);
		this.vista.calcularCambio.addActionListener(this);
		this.vista.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		//Detecta cualquier boton dentro del panel de productos
		for(JButton boton : botones) {
			if(e.getSource()== boton) {
				agregarProducto(boton);
			} 
		}
		
		if(e.getSource()==vista.facturar) {
			vista.txtTotal.setText(String.valueOf(pedido.calcularTotal()));
			generarRecibo();
		}
		
		if(e.getSource()==vista.calcularCambio) {
			vista.txtCambio.setText(String.valueOf(Integer.valueOf(vista.cambio.getText()) - pedido.calcularTotal()));
		}
		
		if (e.getSource()==vista.salir) {
			modelo.crear(pedido);
			pedido.setFecha(LocalDateTime.now());
			modelo.guardar();
			JOptionPane.showMessageDialog(vista, "Pedido Archivado Correctamente.");
			vista.dispose();
		}
	}
	
	/*filtra los botones del resto de objetos en el Panel,los agrega a un arreglo y añade el actionlistener
	para cada uno*/
	public void filtrarProductos() {
		int count=0;
		for(Component a : vista.panel.getComponents()) {			
			if(a.getClass()==vista.facturar.getClass() ) {
				botones[count]= (JButton) a;
			}
			count++;
		}
		for(int i=0;i<15;i++) {
			JButton boton = botones[i];
			boton.addActionListener(this);
		}
	}
	
	public void agregarProducto(JButton boton) {
		for (Producto producto : catalogo.getCatalogo()) {
			if(Integer.valueOf(boton.getText())==producto.getCodigo()) {
				pedido.agregarOrden(producto, 1);
				actualizarFactura();
				break;
			}
		}
	}
	public void actualizarFactura() {
		int filas = vista.model.getRowCount();
		for(int i=0;filas>i;i++) {
			vista.model.removeRow(0);
		}
			
		for (Orden orden:pedido.getOrdenes()) {
			Object[] fila =new Object[3];
			fila[0] = orden.getProducto().getNombre();
			fila[1] = orden.getProducto().getPrecio();
			fila[2] = orden.getCantidad();
		
			vista.model.addRow(fila);
		}		
	}
	public void generarRecibo(){
		vista.recibo.setFont(new Font("Tahoma", Font.BOLD, 15));

		vista.recibo.setText("");
		vista.recibo.append("                   FACTURA ELECTRONICA\n\n");
		vista.recibo.append("Direccion:	                  Cll. 148 #107-50\n");
		vista.recibo.append("Cel:		3015090076\n");
		vista.recibo.append("Fecha: 	              "+pedido.formarFecha(LocalDateTime.now()));
		vista.recibo.append("\n  ------------------------------------------------\n");
		vista.recibo.append("Producto	           Unidades        Precio U\n\n");
		for (Orden orden : pedido.getOrdenes()) {
			vista.recibo.append(orden.getProducto().getNombre());
			vista.recibo.append("	                 ");
			vista.recibo.append(String.valueOf(orden.getCantidad()));
			vista.recibo.append("	             ");
			vista.recibo.append(String.valueOf(orden.getProducto().getPrecio()));
			vista.recibo.append("\n");
		}
		vista.recibo.append("\n  -------------------------------------------------\n");
		vista.recibo.append("       TOTAL		          " + pedido.calcularTotal());
		vista.recibo.append("\n  -------------------------------------------------\n");			
		vista.recibo.append("                     Gracias Por Tu Compra!");
		vista.recibo.append("\n  -------------------------------------------------\n");
		vista.recibo.setFont(new Font("Tahoma", Font.BOLD, 15));
	}
}


	
