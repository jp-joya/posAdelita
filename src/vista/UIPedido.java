package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
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

public class UIPedido extends JFrame {

	public JPanel contentPane;
	public JButton facturar;
	public JTextArea factura;
	private JButton taco;
	private JButton coca;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIPedido frame = new UIPedido();
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
	public UIPedido() {
		setResizable(false);
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1023, 642);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		facturar = new JButton("Finalizar");
		facturar.setBounds(908, 569, 89, 23);
		contentPane.add(facturar);
		
		factura = new JTextArea();
		factura.setBounds(666, 26, 331, 333);
		contentPane.add(factura);
		
		taco = new JButton("");
		taco.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/taco.jpg")));
		taco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		taco.setBounds(10, 27, 131, 112);
		contentPane.add(taco);
		
		coca = new JButton("");
		coca.setIcon(new ImageIcon(UIPedido.class.getResource("/imagenes/coca.png")));
		coca.setBounds(170, 27, 131, 112);
		contentPane.add(coca);
	}
}
