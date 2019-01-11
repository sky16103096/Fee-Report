import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

import javax.swing.JTextField;
import javax.swing.JButton;

public class AddAccountant {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddAccountant window = new AddAccountant();
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
	public AddAccountant() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 550, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAddAccounatnt = new JLabel("ADD ACCOUNTANT");
		lblAddAccounatnt.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddAccounatnt.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAddAccounatnt.setBounds(131, 26, 231, 24);
		frame.getContentPane().add(lblAddAccounatnt);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblName.setBounds(63, 81, 56, 16);
		frame.getContentPane().add(lblName);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPassword.setBounds(63, 120, 95, 16);
		frame.getContentPane().add(lblPassword);
		
		JLabel lblEmail = new JLabel("EMAIL");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEmail.setBounds(63, 160, 56, 16);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblContactNumber = new JLabel("CONTACT NO.");
		lblContactNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblContactNumber.setBounds(63, 199, 115, 16);
		frame.getContentPane().add(lblContactNumber);
		
		textField = new JTextField();
		textField.setBounds(197, 78, 220, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(197, 117, 220, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(197, 157, 220, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(197, 196, 220, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton = 
				new JButton("ADD");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(322, 246, 95, 25);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=textField.getText();
				String ch=textField.getText();
				String password=String.valueOf(ch);
				String email=textField_1.getText();
				String contactno=textField_2.getText();
				
				Accountant a=new Accountant(name,password,email,contactno);
				int status=AccountantDao.save(a);
				
				if(status>0)
				{
					JOptionPane.showMessageDialog(btnNewButton, AddAccountant.this,"Accountant added successfully!", status);
					textField.setText("");textField_1.setText("");textField_2.setText("");
					textField.setText("");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, AddAccountant.this,"Sorry, Unable to add Accountant!", status);
				}
			}
		});
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				AdminSection.main(new String[]{});
				frame.dispose();
				
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnBack.setBounds(197, 246, 95, 25);
		frame.getContentPane().add(btnBack);
		
	}
}
