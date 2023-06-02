package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class UIMetricas extends JFrame {

	private JPanel contentPane;
	public JButton obtener;
	public JComboBox opcion;
	private JLabel lblNewLabel;
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
		
		opcion = new JComboBox();
		opcion.setModel(new DefaultComboBoxModel(new String[] {"", "Mas vendidos", "Menos vendidos", "Franja horaria pico", "Ganancias totales"}));
		opcion.setBounds(92, 0, 147, 22);
		contentPane.add(opcion);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 351, 332);
		contentPane.add(scrollPane);
		
		obtener = new JButton("obtener");
		obtener.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		obtener.setBounds(254, 0, 107, 22);
		contentPane.add(obtener);
		
		lblNewLabel = new JLabel("Metrica:");
		lblNewLabel.setBounds(10, 0, 72, 22);
		contentPane.add(lblNewLabel);
	}
}
