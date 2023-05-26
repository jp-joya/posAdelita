package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import java.awt.Font;

public class UICatalogo extends JFrame {

	public JPanel contentPane;
	public JTable tabla;
	public DefaultTableModel model;
	public JButton actualizar; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UICatalogo frame = new UICatalogo();
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
	public UICatalogo() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 28, 414, 222);
		contentPane.add(scrollPane);
		
		tabla = new JTable();
		model = new DefaultTableModel();
		tabla.setModel(model);
		model.addColumn("Codigo");
		model.addColumn("Nombre");
		model.addColumn("Precio");
		
		scrollPane.setViewportView(tabla);
		
		JLabel lblNewLabel = new JLabel("CATALOGO PRODUCTOS");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(77, 7, 170, 14);
		contentPane.add(lblNewLabel);
		
		actualizar = new JButton("Actualizar");
		actualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		actualizar.setBounds(322, 3, 102, 23);
		contentPane.add(actualizar);
		
	}
}
