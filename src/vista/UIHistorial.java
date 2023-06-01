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
		setBounds(100, 100, 493, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 343, 385);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(true);
		model = new DefaultTableModel();
		table.setModel(model);
		model.addColumn("N#");
		model.addColumn("Fecha");
		model.addColumn("#Productos");
		model.addColumn("Total");
        TableColumn column = table.getColumnModel().getColumn(0);
        TableColumn column1 = table.getColumnModel().getColumn(1);
        column.setMaxWidth(30);
        column.setMinWidth(30);
        column1.setMaxWidth(100);
        column1.setMinWidth(100);
	    table.getColumnModel().getColumn(0).setPreferredWidth(5);
		scrollPane.setViewportView(table);

		
		actualizar = new JButton("actualizar");
		actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		actualizar.setBounds(363, 11, 112, 23);
		contentPane.add(actualizar);
		
		detalle = new JButton("ver detalles");
		detalle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		detalle.setBounds(363, 339, 112, 23);
		contentPane.add(detalle);
		
		salir = new JButton("Salir");
		salir.setBounds(363, 373, 112, 23);
		contentPane.add(salir);
	}
}
