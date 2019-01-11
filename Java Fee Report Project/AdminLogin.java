import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

//import com.javatpoint.feereport.AdminLogin;
//import com.javatpoint.feereport.AdminSection;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class AdminLogin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin window = new AdminLogin();
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
	public AdminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAdminLogin = new JLabel("ADMIN LOGIN");
		lblAdminLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAdminLogin.setBounds(107, 27, 211, 24);
		frame.getContentPane().add(lblAdminLogin);
		
		JLabel label_1 = new JLabel("NAME");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_1.setBounds(77, 84, 49, 19);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("PASSWORD");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		label_2.setBounds(73, 119, 89, 19);
		frame.getContentPane().add(label_2);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(174, 83, 174, 22);
		frame.getContentPane().add(textField);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(174, 118, 174, 22);
		frame.getContentPane().add(passwordField);
		
		JButton button = new JButton("Login");
		button.setFont(new Font("Times New Roman", Font.BOLD, 16));
		button.setBounds(174, 160, 81, 27);
		frame.getContentPane().add(button);
		
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
			String name=textField.getText();
			char ch[]=passwordField.getPassword();
			String password=String.valueOf(ch);
			
			if(name.equals("admin")&&password.equals("admin123"))
			{
				String s[]={};
				AdminSection.main(s);
				frame.dispose();
			}
			else
			{
				JOptionPane.showMessageDialog(button, AdminLogin.this,"Sorry, username or password error!", 0);
				textField.setText("");passwordField.setText("");
			}
			}
		});
		
		JButton button_1 = new JButton("Back");
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		button_1.setBounds(267, 160, 81, 27);
		frame.getContentPane().add(button_1);
	}

}
