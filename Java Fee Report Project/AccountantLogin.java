import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import javax.swing.JPasswordField;
import javax.swing.JButton;

public class AccountantLogin 
{

	private JFrame frmAccountantLogin;
	private JTextField textField;
	private JPasswordField passwordField;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					AccountantLogin window = new AccountantLogin();
					window.frmAccountantLogin.setVisible(true);
				} 
				catch (Exception e) 
				{	e.printStackTrace();	}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AccountantLogin()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAccountantLogin = new JFrame();
		frmAccountantLogin.setTitle("Accountant Login");
		frmAccountantLogin.setBounds(100, 100, 450, 300);
		frmAccountantLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frmAccountantLogin.setContentPane(contentPane);
		contentPane.setLayout(null);
		//contentPane.setLayout(null);
		
		JLabel lblAccountantLogin = new JLabel("ACCOUNTANT LOGIN");
		lblAccountantLogin.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccountantLogin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAccountantLogin.setBounds(107, 36, 211, 24);
		frmAccountantLogin.getContentPane().add(lblAccountantLogin);
		
		textField = new JTextField();
		textField.setBounds(184, 88, 174, 22);
		frmAccountantLogin.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(184, 123, 174, 22);
		frmAccountantLogin.getContentPane().add(passwordField);
		
		JLabel lblNewLabel = new JLabel("NAME");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(87, 89, 49, 19);
		frmAccountantLogin.getContentPane().add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPassword.setBounds(83, 124, 89, 19);
		frmAccountantLogin.getContentPane().add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnLogin.setBounds(184, 165, 81, 27);
		frmAccountantLogin.getContentPane().add(btnLogin);
		
		btnLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				
			String name=textField.getText();
			String password=String.valueOf(passwordField.getPassword());
			
			boolean status=AccountantDao.validate(name, password);
			
			if(status)
			{
				Accountantsection.main(new String[]{});
				frmAccountantLogin.dispose();
			}
			else
			{
				//JOptionPane.showMessageDialog(AccountantLogin.this,"Sorry, username or password error!","Login error!",JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		
		JButton btnBack = new JButton("Back");
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnBack.setBounds(277, 165, 81, 27);
		frmAccountantLogin.getContentPane().add(btnBack);
	}
}
