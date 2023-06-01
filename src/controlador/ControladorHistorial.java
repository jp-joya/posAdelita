package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import modelo.dao.PedidoDAO;
import modelo.dto.Pedido;
import modelo.dto.Producto;
import vista.UIHistorial;

public class ControladorHistorial implements ActionListener{
	private UIHistorial vista;
	private PedidoDAO modelo;
	
	public ControladorHistorial(UIHistorial vista) {
		this.vista = vista;
		this.modelo = new PedidoDAO();
		this.vista.actualizar.addActionListener(this);
		this.vista.detalle.addActionListener(this);
		this.vista.salir.addActionListener(this);
		this.vista.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.vista.actualizar) {
			vista.table.getColumnModel().getColumn(0).setPreferredWidth(10);
			int filas = vista.model.getRowCount();
			for(int i=0;filas>i;i++) {
				vista.model.removeRow(0);
			}
			for (Pedido pedido:modelo.getListaPedidos()) {
				Object[] fila =new Object[4];
				fila[0] = modelo.getListaPedidos().indexOf(pedido)+1;
				fila[1] = pedido.formarFecha(pedido.getFecha());
				fila[2] = pedido.calcularCantidad();
				fila[3] = pedido.calcularTotal();
				
				vista.model.addRow(fila);
			}
		}
		
		if(e.getSource()==this.vista.detalle) {
			Pedido pedido=null;
			int fila = vista.table.getSelectedRow();
						
			for (Pedido p : modelo.getListaPedidos()) {
				if(fila== modelo.getListaPedidos().indexOf(p)) {
					pedido = p;
					break;
				}
			}
			JOptionPane.showMessageDialog(vista,"Producto/Precio/Cantidad\n\n" +  pedido.toString());
			
		}
		
		if(e.getSource()==this.vista.salir) {
			vista.dispose();
		}
	}
}
	
