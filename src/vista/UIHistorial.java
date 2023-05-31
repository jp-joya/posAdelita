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

public class UIHistorial extends JFrame {

	public JPanel contentPane;
	public DefaultTableModel model;
	public JTable table;
	public JButton actualizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIHistorial frame = new UIHistorial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public UIHistorial() {
		setType(Type.UTILITY);
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 414, 213);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setEnabled(false);
		model = new DefaultTableModel();
		table.setModel(model);
		model.addColumn("#N");
		model.addColumn("Detalle");
        TableColumn column = table.getColumnModel().getColumn(0);
        column.setMaxWidth(30);
        column.setMinWidth(30);
	    table.getColumnModel().getColumn(0).setPreferredWidth(5);
	    
		scrollPane.setViewportView(table);

		
		actualizar = new JButton("actualizar");
		actualizar.setBounds(325, 227, 99, 23);
		contentPane.add(actualizar);
	}
}
