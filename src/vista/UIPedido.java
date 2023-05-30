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
import java.awt.event.ActionEvent;

public class UIPedido extends JFrame {

	public JPanel contentPane;
	public JButton taco;
	public JButton burrito;
	public JButton facturar;

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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		taco = new JButton("taco");
		taco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		taco.setBounds(35, 57, 89, 23);
		contentPane.add(taco);
		
		burrito = new JButton("burrito");
		burrito.setBounds(35, 123, 89, 23);
		contentPane.add(burrito);
		
		facturar = new JButton("Finalizar");
		facturar.setBounds(335, 227, 89, 23);
		contentPane.add(facturar);
	}
}
