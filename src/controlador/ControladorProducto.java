package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import modelo.dao.ProductoDAO;
import modelo.dto.Producto;
import vista.UICatalogo;
import vista.UIProducto;

public class ControladorProducto implements ActionListener{
	private UIProducto vista;
	private ProductoDAO modelo;
							
	public ControladorProducto(UIProducto vista) {
		this.vista =vista;
		this.modelo = new ProductoDAO();
		this.vista.guardar.addActionListener(this);
		this.vista.salir.addActionListener(this);
		this.vista.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(this.vista.guardar)) {
			
			Producto producto=new Producto();
			producto.setCodigo(Integer.valueOf(vista.codigo.getText()));
			producto.setNombre(vista.nombre.getText());
			producto.setPrecio(Integer.valueOf(vista.precio.getText()));
			
			modelo.crear(producto);	
			modelo.guardar();
			
			vista.precio.setText("");
			vista.codigo.setText("");
			vista.nombre.setText("");
		}
		if (e.getSource().equals(this.vista.salir)) {
			modelo.guardar();
			vista.dispose();	
		}
	}
}
	
