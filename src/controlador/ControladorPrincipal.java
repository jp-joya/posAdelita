package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.dao.ProductoDAO;
import modelo.dto.Producto;
import vista.UIProducto;
import vista.UICatalogo;
import vista.UIPrincipal;

public class ControladorPrincipal implements ActionListener{
	private UIPrincipal vista;
	
	public ControladorPrincipal(UIPrincipal vista) {
		this.vista = vista;
		this.vista.crearProducto.addActionListener(this);
		this.vista.verCatalogo.addActionListener(this);
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
		if(e.getSource()==this.vista.salir) {
			System.exit(0);
		}	
	}

}
