package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.dao.PedidoDAO;
import modelo.dao.ProductoDAO;
import modelo.dto.Pedido;
import modelo.dto.Producto;
import vista.UIPedido;

public class ControladorPedido implements ActionListener {
	private UIPedido vista;
	private PedidoDAO modelo;
	private ProductoDAO catalogo;
	private Producto producto;
	private Pedido pedido;
	
	
	public ControladorPedido(UIPedido vista) {
		this.vista = vista;
		this.modelo = new PedidoDAO();
		this.catalogo = new ProductoDAO();
		this.pedido = new Pedido();
		this.vista.facturar.addActionListener(this);

		this.vista.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if (e.getSource()==vista.facturar) {
			modelo.crear(pedido);
			modelo.guardar();
			vista.dispose();
		}
	}
}

	
