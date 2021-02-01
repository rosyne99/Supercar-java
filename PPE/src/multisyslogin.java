import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class multisyslogin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField txtAnnuler;
	private JTextField txtLogin;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					multisyslogin window = new multisyslogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public multisyslogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(248, 248, 255));
		frame.getContentPane().setBackground(new Color(245, 245, 245));
		frame.setBounds(320, 180, 629, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(151, 90, 327, 48);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(151, 149, 327, 48);
		frame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("SuperCar");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Arial Black", Font.ITALIC, 44));
		lblNewLabel.setBounds(194, 24, 237, 48);
		frame.getContentPane().add(lblNewLabel);
		
		txtAnnuler = new JTextField();
		txtAnnuler.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		txtAnnuler.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtAnnuler.setHorizontalAlignment(SwingConstants.CENTER);
		txtAnnuler.setText("Annuler");
		txtAnnuler.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtAnnuler.setEditable(false);
		txtAnnuler.setBounds(151, 227, 131, 42);
		frame.getContentPane().add(txtAnnuler);
		txtAnnuler.setColumns(10);
		
		txtLogin = new JTextField();
		txtLogin.setFont(new Font("Arial Black", Font.PLAIN, 15));
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setText("Login");
		txtLogin.setEditable(false);
		txtLogin.setColumns(10);
		txtLogin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtLogin.setBounds(347, 227, 131, 42);
		frame.getContentPane().add(txtLogin);
		frame.setUndecorated(true);
	}
}
