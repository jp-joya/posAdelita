package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JButton;
import javax.swing.JMenu;
import java.awt.Canvas;
import javax.swing.JMenuItem;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class UIPrincipal extends JFrame {

	public JPanel contentPane;
	public JMenuItem crearProducto;
	public JMenuItem verCatalogo;
	public JButton salir;
	public JButton nuevoPedido;
	public JMenuItem historial;
	public JMenuItem metricas;

	/**
	 * Create the frame.
	 */
	public UIPrincipal() {
		setTitle("POS Adelita");
		setIconImage(Toolkit.getDefaultToolkit().getImage(UIPrincipal.class.getResource("/imagenes/n.png")));
		setAlwaysOnTop(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Pedidos");
		menuBar.add(mnNewMenu);
		
		historial = new JMenuItem("Historial");
		mnNewMenu.add(historial);
		
		metricas = new JMenuItem("Metricas");
		mnNewMenu.add(metricas);
		
		JMenu mnNewMenu_1 = new JMenu("Productos");
		menuBar.add(mnNewMenu_1);
		
		crearProducto = new JMenuItem("Crear Producto");
		mnNewMenu_1.add(crearProducto);
		
		verCatalogo = new JMenuItem("Ver catalogo");
		mnNewMenu_1.add(verCatalogo);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nuevoPedido = new JButton("Nuevo Pedido");
		nuevoPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		nuevoPedido.setBounds(161, 153, 117, 43);
		contentPane.add(nuevoPedido);
		
		salir = new JButton("salir");
		salir.setBounds(351, 216, 69, 23);
		contentPane.add(salir);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(UIPrincipal.class.getResource("/imagenes/logocantina.png")));
		lblNewLabel_1.setBounds(83, -32, 268, 228);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("v1.0");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblNewLabel.setBounds(23, 225, 63, 14);
		contentPane.add(lblNewLabel);
	}
}
