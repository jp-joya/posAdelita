package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.UIMetricas;

public class ControladorMetricas implements ActionListener{
	private UIMetricas vista;

	public ControladorMetricas(UIMetricas vista) {
		this.vista = vista;
		this.vista.obtener.addActionListener(this);
		this.vista.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this.vista.obtener) {
			System.out.println(vista.opcion.getModel().getSelectedItem()==vista.opcion.getModel().getElementAt(0));
		}
	}
	
	public void masVendidos() {
		
	}
	public void menosVendidos() {
		
	}
	public void horarioPico() {
		
	}
	public void gananciasTotales() {
		
	}
	
	
	
}
