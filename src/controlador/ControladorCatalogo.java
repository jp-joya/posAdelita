package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.dao.ProductoDAO;
import modelo.dto.Producto;
import vista.UICatalogo;
import vista.UIProducto;

public class ControladorCatalogo implements ActionListener{
	private UICatalogo vista;
	private ProductoDAO modelo;
	
	public ControladorCatalogo(UICatalogo vista) {
		this.vista =vista;
		this.modelo = new ProductoDAO();
		this.vista.actualizar.addActionListener(this);
		this.vista.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.vista.actualizar) {
			int filas = vista.model.getRowCount();
			for(int i=0;filas>i;i++) {
				vista.model.removeRow(0);
			}
			
			for (Producto producto:modelo.getCatalogo()) {
				Object[] fila =new Object[3];
				fila[0] = producto.getCodigo();
				fila[1] = producto.getNombre();
				fila[2] = producto.getPrecio();
				vista.model.addRow(fila);
			}
			
		}
	}
	
}
