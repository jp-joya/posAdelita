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
			System.out.println("a");
			int filas = vista.model.getRowCount();
			for(int i=0;filas>i;i++) {
				vista.model.removeRow(0);
			}
			System.out.println(modelo.getListaPedidos());
			for (Pedido pedido:modelo.getListaPedidos()) {
				Object[] fila =new Object[3];
				fila[0] = pedido.getNumero();
				fila[1] = pedido.getNumero();
				fila[2] = pedido.getNumero();
				vista.model.addRow(fila);
				System.out.println(pedido);
			}
		}
	}
}
	
