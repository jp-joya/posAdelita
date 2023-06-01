package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JToolBar;
import javax.swing.JTabbedPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Window.Type;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class UIProducto extends JFrame {

	public JPanel contentPane;
	public JTextField codigo;
	public JButton guardar;
	public JTextField precio;
	public JTextField nombre;
	public JButton salir;

	/**
	 * Create the frame.
	 */
	public UIProducto() {
		setAlwaysOnTop(true);
		setForeground(UIManager.getColor("Button.disabledForeground"));
		setResizable(false);
		setType(Type.UTILITY);
		setBackground(new Color(192, 192, 192));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 459, 324);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Codigo");
		lblNewLabel.setBounds(10, 49, 49, 14);
		contentPane.add(lblNewLabel);
		
		codigo = new JTextField();
		codigo.setBounds(10, 74, 96, 20);
		contentPane.add(codigo);
		codigo.setColumns(10);
		
		guardar = new JButton("Guardar");
		guardar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){};
			});
		guardar.setBounds(234, 251, 89, 23);
		contentPane.add(guardar);
		
		JLabel lblNewLabel_1 = new JLabel("Precio");
		lblNewLabel_1.setBounds(10, 105, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre");
		lblNewLabel_2.setBounds(10, 161, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		precio = new JTextField();
		precio.setBounds(10, 130, 96, 20);
		contentPane.add(precio);
		precio.setColumns(10);
		
		nombre = new JTextField();
		nombre.setBounds(10, 186, 96, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		salir = new JButton("Salir");
		salir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		salir.setBounds(344, 251, 89, 23);
		contentPane.add(salir);
		
		JLabel lblNewLabel_3 = new JLabel("CREAR PRODUCTO");
		lblNewLabel_3.setBounds(173, 0, 134, 39);
		contentPane.add(lblNewLabel_3);
		
	}
}
