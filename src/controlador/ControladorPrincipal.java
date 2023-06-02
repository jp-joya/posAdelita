package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenuItem;

import modelo.dao.ProductoDAO;
import modelo.dto.Producto;
import vista.UIProducto;
import vista.UICatalogo;
import vista.UIPedido;
import vista.UIPrincipal;
import vista.UIHistorial;
import vista.UIMetricas;

public class ControladorPrincipal implements ActionListener{
	private UIPrincipal vista;
	
	public ControladorPrincipal(UIPrincipal vista) {
		this.vista = vista;
		this.vista.crearProducto.addActionListener(this);
		this.vista.verCatalogo.addActionListener(this);
		this.vista.nuevoPedido.addActionListener(this);
		this.vista.historial.addActionListener(this);
		this.vista.metricas.addActionListener(this);
		this.vista.salir.addActionListener(this);
		this.vista.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.vista.crearProducto) {
			ControladorProducto cProducto = new ControladorProducto(new UIProducto());
		}
		if(e.getSource()==this.vista.verCatalogo) {
			ControladorCatalogo cCatalogo = new ControladorCatalogo(new UICatalogo());
		}
		if(e.getSource()==this.vista.nuevoPedido) {
			ControladorPedido cPedido = new ControladorPedido(new UIPedido());
		}
		if(e.getSource()==this.vista.historial) {
			ControladorHistorial cHistorial = new ControladorHistorial(new UIHistorial());
		}
		if(e.getSource()==this.vista.metricas) {
			ControladorMetricas cMetricas = new ControladorMetricas(new UIMetricas());
		}
		if(e.getSource()==this.vista.salir) {
			System.exit(0);
		}	
	}

}
