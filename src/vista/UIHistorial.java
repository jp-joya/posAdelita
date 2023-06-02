package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class UIHistorial extends JFrame {

	public JPanel contentPane;
	public DefaultTableModel model;
	public JTable table;
	public JButton actualizar;
	public JButton detalle;
	public JButton salir;

	/**
	 * Create the frame.
	 */
	public UIHistorial() {
		setAlwaysOnTop(true);
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 427, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 250, 385);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(true);
		model = new DefaultTableModel();
		table.setModel(model);
		model.addColumn("N#");
		model.addColumn("Fecha");
		model.addColumn("#P");
		model.addColumn("Total");
        TableColumn column1 = table.getColumnModel().getColumn(0);
        TableColumn column2 = table.getColumnModel().getColumn(1);
        TableColumn column3 = table.getColumnModel().getColumn(2);
        TableColumn column4 = table.getColumnModel().getColumn(3);

        column1.setMaxWidth(30);
        column1.setMinWidth(30);
        column2.setMaxWidth(110);
        column2.setMinWidth(110);
        column3.setMaxWidth(30);
        column3.setMinWidth(30); 
        column4.setMaxWidth(70);
        column4.setMinWidth(70);
       

	    table.getColumnModel().getColumn(0).setPreferredWidth(5);
		scrollPane.setViewportView(table);

		
		actualizar = new JButton("actualizar");
		actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		actualizar.setBounds(293, 8, 112, 23);
		contentPane.add(actualizar);
		
		detalle = new JButton("ver detalles");
		detalle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		detalle.setBounds(293, 341, 112, 23);
		contentPane.add(detalle);
		
		salir = new JButton("Salir");
		salir.setBounds(293, 375, 112, 23);
		contentPane.add(salir);
	}
}
