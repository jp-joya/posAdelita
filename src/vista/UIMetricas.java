package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Window.Type;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.SwingConstants;

public class UIMetricas extends JFrame {

	private JPanel contentPane;
	public JButton obtener;
	private JLabel lblNewLabel;
	public JLabel txtTotal;
	private JLabel lblMejorDia;
	public JLabel txtDia;
	public DefaultTableModel modelMejores;
	public DefaultTableModel modelPeores;
	private JTable mejores;
	private JLabel lblNewLabel_1;
	/**
	 * Create the frame.
	 */
	public UIMetricas() {
		setAlwaysOnTop(true);
		setTitle("POS Adelita - Metricas");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 612, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 351, 332);
		contentPane.add(scrollPane);
		
		mejores = new JTable();
		modelMejores = new DefaultTableModel();
		mejores.setModel(modelMejores);
		modelMejores.addColumn("Codigo");
		modelMejores.addColumn("Nombre");
		modelMejores.addColumn("Cantidad");
		scrollPane.setViewportView(mejores);
		
		
		
		obtener = new JButton("obtener");
		obtener.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		obtener.setBounds(479, 33, 107, 22);
		contentPane.add(obtener);
		
		lblNewLabel = new JLabel("Total Ventas:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(371, 308, 99, 60);
		contentPane.add(lblNewLabel);
		
		txtTotal = new JLabel("0.0");
		txtTotal.setHorizontalAlignment(SwingConstants.RIGHT);
		txtTotal.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtTotal.setBounds(451, 308, 135, 60);
		contentPane.add(txtTotal);
		
		lblMejorDia = new JLabel("Mejor Dia:");
		lblMejorDia.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblMejorDia.setBounds(371, 247, 99, 60);
		contentPane.add(lblMejorDia);
		
		txtDia = new JLabel("");
		txtDia.setHorizontalAlignment(SwingConstants.RIGHT);
		txtDia.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtDia.setBounds(451, 247, 135, 60);
		contentPane.add(txtDia);
		
		lblNewLabel_1 = new JLabel("Productos Mas Vendidos");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 0, 351, 29);
		contentPane.add(lblNewLabel_1);
	}
}
