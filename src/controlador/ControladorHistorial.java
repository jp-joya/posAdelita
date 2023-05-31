package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
				Object[] fila =new Object[2];
				fila[0] = modelo.getListaPedidos().indexOf(pedido)+1;
				fila[1] = pedido.toString();
				vista.model.addRow(fila);
			}
		}
	}
}
	
