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

public class UIPrincipal extends JFrame {

	public JPanel contentPane;
	public JMenuItem crearProducto;
	public JMenuItem verCatalogo;
	public JButton salir;
	public JButton nuevoPedido;
	public JMenuItem historial;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIPrincipal frame = new UIPrincipal();
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
	public UIPrincipal() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(UIPrincipal.class.getResource("/imagenes/pos.png")));
		setTitle("POS Adelita");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Pedidos");
		menuBar.add(mnNewMenu);
		
		historial = new JMenuItem("Historial");
		mnNewMenu.add(historial);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Estadisticas");
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenu mnNewMenu_1 = new JMenu("Productos");
		menuBar.add(mnNewMenu_1);
		
		//crearProducto = new JMenuItem("Crear Producto");
		//mnNewMenu_1.add(crearProducto);
		
		verCatalogo = new JMenuItem("Ver catalogo");
		mnNewMenu_1.add(verCatalogo);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nuevoPedido = new JButton("Nuevo Pedido");
		nuevoPedido.setBounds(294, 72, 117, 23);
		contentPane.add(nuevoPedido);
		
		salir = new JButton("salir");
		salir.setBounds(294, 106, 117, 23);
		contentPane.add(salir);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(UIPrincipal.class.getResource("/imagenes/pos.png")));
		lblNewLabel.setBounds(7, 0, 290, 240);
		contentPane.add(lblNewLabel);
	}
}
