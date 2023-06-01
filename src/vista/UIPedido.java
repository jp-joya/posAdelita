package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Window.Type;
import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSlider;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.JPasswordField;
import javax.swing.JEditorPane;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class UIPedido extends JFrame {

	public JPanel contentPane;
	public JTable table;
	public DefaultTableModel model;

	
	public JLabel txtCambio;
	public JLabel txtTotal;
	public JButton salir;
	public JButton facturar;
	public JTextArea recibo;
	public JTextField cambio;
	public JPanel panel;
	public JButton calcularCambio;
	
	//botones productos
	public JButton beerNdeer;
	public JButton bMargarita;
	public JButton caipi;
	public JButton canterito;
	public JButton catrina;
	public JButton cerveza;
	public JButton cosmopolitan;
	public JButton cubaLibre;
	public JButton daikiriFresa;
	public JButton gomas;
	public JButton guaya;
	public JButton kamikaze;
	public JButton amarillo;
	public JButton mango;
	public JButton agua;

	/**
	 * Create the frame.
	 */
	public UIPedido() {
		setAlwaysOnTop(true);
		setTitle("CRETAPOS - NUEVO PEDIDO");
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1280, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		panel = new JPanel();
		panel.setBounds(10, 56, 562, 416);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setEnabled(false);
		scrollPane.setBounds(582, 11, 331, 302);
		contentPane.add(scrollPane);
		
		//================================FUNCIONES=========================================
		
		facturar = new JButton("Facturar");
		facturar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		facturar.setBounds(923, 420, 123, 43);
		contentPane.add(facturar);
		
		salir = new JButton("Salir");
		salir.setFont(new Font("Tahoma", Font.PLAIN, 20));
		salir.setBounds(1131, 420, 123, 43);
		contentPane.add(salir);
		
		table = new JTable();
		model = new DefaultTableModel();
		table.setModel(model);
		model.addColumn("Producto");
		model.addColumn("Precio");
		model.addColumn("Cantidad");

		scrollPane.setViewportView(table);
		
		cambio = new JTextField();
		cambio.setHorizontalAlignment(SwingConstants.RIGHT);
		cambio.setFont(new Font("Tahoma", Font.PLAIN, 16));
		cambio.setBounds(712, 385, 117, 27);
		contentPane.add(cambio);
		cambio.setColumns(10);
		
		txtTotal = new JLabel("0.0");
		txtTotal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setBounds(706, 324, 123, 36);
		contentPane.add(txtTotal);
		
		txtCambio = new JLabel("0.0");
		txtCambio.setHorizontalAlignment(SwingConstants.RIGHT);
		txtCambio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCambio.setBounds(706, 423, 123, 36);
		contentPane.add(txtCambio);
		
		calcularCambio = new JButton("");
		calcularCambio.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/calculadora.png")));
		calcularCambio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		calcularCambio.setBounds(849, 385, 27, 27);
		contentPane.add(calcularCambio);

		//==========================PRODUCTOS=================================
		
		beerNdeer = new JButton("1");
		beerNdeer.setFont(new Font("Tahoma", Font.PLAIN, 5));
		beerNdeer.setBounds(10, 11, 100, 100);
		panel.add(beerNdeer);
		beerNdeer.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/beeranddeer.png")));
		
		bMargarita = new JButton("2");
		bMargarita.setFont(new Font("Tahoma", Font.PLAIN, 5));
		bMargarita.setBounds(120, 11, 100, 100);
		panel.add(bMargarita);
		bMargarita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		bMargarita.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/bluemargarita.png")));
		
		caipi = new JButton("3");
		caipi.setFont(new Font("Tahoma", Font.PLAIN, 5));
		caipi.setBounds(230, 11, 100, 100);
		panel.add(caipi);
		caipi.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/caipiroska.png")));
		
		canterito = new JButton("4");
		canterito.setFont(new Font("Tahoma", Font.PLAIN, 5));
		canterito.setBounds(340, 11, 100, 100);
		panel.add(canterito);
		canterito.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/canterito.png")));
		
		catrina = new JButton("5");
		catrina.setFont(new Font("Tahoma", Font.PLAIN, 5));
		catrina.setBounds(450, 11, 100, 100);
		panel.add(catrina);
		catrina.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/catrina.png")));
		
		 cerveza = new JButton("6");
		 cerveza.setFont(new Font("Tahoma", Font.PLAIN, 5));
		cerveza.setBounds(10, 142, 100, 100);
		panel.add(cerveza);
		cerveza.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/cerveza.png")));
		
		cosmopolitan = new JButton("7");
		cosmopolitan.setFont(new Font("Tahoma", Font.PLAIN, 5));
		cosmopolitan.setBounds(120, 142, 100, 100);
		panel.add(cosmopolitan);
		cosmopolitan.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/cosmoporlitan.png")));
		
		cubaLibre = new JButton("8");
		cubaLibre.setFont(new Font("Tahoma", Font.PLAIN, 5));
		cubaLibre.setBounds(230, 142, 100, 100);
		panel.add(cubaLibre);
		cubaLibre.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/cubalibre.png")));
		
		daikiriFresa = new JButton("9");
		daikiriFresa.setFont(new Font("Tahoma", Font.PLAIN, 5));
		daikiriFresa.setBounds(340, 142, 100, 100);
		panel.add(daikiriFresa);
		daikiriFresa.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/daikirifresa.png")));
		
		gomas = new JButton("10");
		gomas.setFont(new Font("Tahoma", Font.PLAIN, 5));
		gomas.setBounds(450, 142, 100, 100);
		panel.add(gomas);
		gomas.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/gomas.png")));
		
		guaya = new JButton("11");
		guaya.setFont(new Font("Tahoma", Font.PLAIN, 5));
		guaya.setBounds(10, 272, 100, 100);
		panel.add(guaya);
		guaya.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/guaya.png")));
		
		kamikaze = new JButton("12");
		kamikaze.setFont(new Font("Tahoma", Font.PLAIN, 5));
		kamikaze.setBounds(120, 272, 100, 100);
		panel.add(kamikaze);
		kamikaze.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/kamikaze.png")));
		
		amarillo = new JButton("13");
		amarillo.setFont(new Font("Tahoma", Font.PLAIN, 5));
		amarillo.setBounds(230, 272, 100, 100);
		panel.add(amarillo);
		amarillo.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/licuadoamarillo.png")));
		
		mango = new JButton("14");
		mango.setFont(new Font("Tahoma", Font.PLAIN, 5));
		mango.setBounds(340, 272, 100, 100);
		panel.add(mango);
		mango.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/mango.png")));
		
		agua = new JButton("15");
		agua.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/agua.png")));
		agua.setFont(new Font("Tahoma", Font.PLAIN, 5));
		agua.setBounds(450, 272, 100, 100);
		panel.add(agua);

		//=====================================LABELS VISUALES====================================
		JLabel lblNewLabel = new JLabel("TOTAL:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(613, 324, 123, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CAMBIO:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(613, 423, 123, 43);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PAGO:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(613, 375, 100, 43);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("BeerN'Deer");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_3.setBounds(10, 111, 100, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Margarita");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_3_1.setBounds(120, 108, 100, 20);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Caipiroska");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_3_2.setBounds(230, 108, 100, 20);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Cantarito");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_3_3.setBounds(340, 111, 100, 14);
		panel.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Catrina");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_3_4.setBounds(450, 111, 100, 14);
		panel.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("Cerveza");
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_3_5.setBounds(10, 242, 100, 14);
		panel.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Cosmopoli");
		lblNewLabel_3_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_6.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_3_6.setBounds(120, 239, 100, 20);
		panel.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("Cuba Libre");
		lblNewLabel_3_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_3_7.setBounds(230, 244, 100, 14);
		panel.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_8 = new JLabel("Daikiri");
		lblNewLabel_3_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_8.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_3_8.setBounds(340, 244, 100, 14);
		panel.add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_3_9 = new JLabel("Gomita");
		lblNewLabel_3_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_9.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_3_9.setBounds(450, 244, 100, 14);
		panel.add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_3_10 = new JLabel("Guaya");
		lblNewLabel_3_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_10.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_3_10.setBounds(10, 372, 100, 20);
		panel.add(lblNewLabel_3_10);
		
		JLabel lblNewLabel_3_11 = new JLabel("Kamikaze");
		lblNewLabel_3_11.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_11.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_3_11.setBounds(120, 375, 100, 14);
		panel.add(lblNewLabel_3_11);
		
		JLabel lblNewLabel_3_12 = new JLabel("Licuado ");
		lblNewLabel_3_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_12.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_3_12.setBounds(230, 375, 100, 14);
		panel.add(lblNewLabel_3_12);
		
		JLabel lblNewLabel_3_13 = new JLabel("Mango Loco");
		lblNewLabel_3_13.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_13.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_3_13.setBounds(340, 372, 100, 20);
		panel.add(lblNewLabel_3_13);
		
		JLabel lblNewLabel_3_14 = new JLabel("Agua");
		lblNewLabel_3_14.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_14.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 15));
		lblNewLabel_3_14.setBounds(450, 372, 100, 20);
		panel.add(lblNewLabel_3_14);
		
		JLabel label = new JLabel("New label");
		label.setBounds(636, 493, -64, -9);
		contentPane.add(label);
		
		JLabel lblNewLabel_4 = new JLabel("COCTELES");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(201, 24, 169, 27);
		contentPane.add(lblNewLabel_4);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(923, 11, 331, 398);
		contentPane.add(scrollPane_1);
		
		recibo = new JTextArea();
		recibo.setLineWrap(true);
		scrollPane_1.setViewportView(recibo);
		recibo.setFont(new Font("Tahoma", Font.BOLD, 15));
		recibo.setEnabled(false);
		recibo.setEditable(false);
		
	}
}
