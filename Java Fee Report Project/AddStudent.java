import java.awt.EventQueue;

import javax.swing.*;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;



import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddStudent {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStudent window = new AddStudent();
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
	public AddStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 498, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		frame.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAddStudent = new JLabel("ADD STUDENT");
		lblAddStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddStudent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAddStudent.setBounds(169, 13, 139, 24);
		frame.getContentPane().add(lblAddStudent);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblName.setBounds(30, 70, 47, 18);
		frame.getContentPane().add(lblName);
		
		JLabel lblEmail = new JLabel("EMAIL ");
		lblEmail.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblEmail.setBounds(30, 102, 56, 18);
		frame.getContentPane().add(lblEmail);
		
		JLabel lblCourse = new JLabel("COURSE");
		lblCourse.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCourse.setBounds(30, 133, 63, 18);
		frame.getContentPane().add(lblCourse);
		
		JLabel lblFee = new JLabel("FEE");
		lblFee.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblFee.setBounds(30, 163, 29, 18);
		frame.getContentPane().add(lblFee);
		
		JLabel lblPaid = new JLabel("PAID");
		lblPaid.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPaid.setBounds(34, 194, 37, 18);
		frame.getContentPane().add(lblPaid);
		
		JLabel lblDue = new JLabel("DUE");
		lblDue.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblDue.setBounds(34, 225, 32, 18);
		frame.getContentPane().add(lblDue);
		
		JLabel lblNewLabel = new JLabel("ADDRESS");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNewLabel.setBounds(34, 256, 70, 18);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(174, 70, 251, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(174, 101, 251, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(174, 131, 251, 22);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(174, 161, 251, 22);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(174, 192, 251, 22);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(174, 223, 251, 22);
		frame.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(174, 256, 251, 61);
		frame.getContentPane().add(textPane);
		
		JLabel lblCity = new JLabel("CITY");
		lblCity.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCity.setBounds(34, 332, 37, 18);
		frame.getContentPane().add(lblCity);
		
		JLabel lblState = new JLabel("STATE");
		lblState.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblState.setBounds(34, 364, 49, 18);
		frame.getContentPane().add(lblState);
		
		JLabel lblCountry = new JLabel("COUNTRY");
		lblCountry.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblCountry.setBounds(34, 396, 76, 18);
		frame.getContentPane().add(lblCountry);
		
		JLabel lblContactNo = new JLabel("CONTACT NO.");
		lblContactNo.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblContactNo.setBounds(37, 427, 107, 18);
		frame.getContentPane().add(lblContactNo);
		
		textField_6 = new JTextField();
		textField_6.setBounds(174, 330, 251, 22);
		frame.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(174, 362, 251, 22);
		frame.getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(174, 394, 251, 22);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(174, 425, 251, 22);
		frame.getContentPane().add(textField_9);
		
		JButton btnAddStudent = new JButton("ADD STUDENT");
		btnAddStudent.setFont(new Font("Times New Roman", Font.BOLD, 15));
		
		btnAddStudent.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				String name=textField.getText();
				String email=textField_1.getText();
				String course=textField_2.getText();
				int fee=Integer.parseInt(textField_3.getText());
				int paid=Integer.parseInt(textField_4.getText());
				int due=Integer.parseInt(textField_5.getText());
				String address=textPane.getText();
				String city=textField_6.getText();
				String state=textField_7.getText();
				String country=textField_8.getText();
				String contactno=textField_9.getText();
				
				Student s=new Student(name,email,course,fee,paid,due,address,city,state,country,contactno);
				int status=StudentDao.save(s);
				
				if(status>0)
				{
					JOptionPane.showMessageDialog(btnAddStudent, AddStudent.this,"Student added successfully!", status);
					textField.setText("");textField_1.setText("");textField_2.setText("");
					textField_3.setText("");textField_4.setText("");textField_5.setText("");
					textField_6.setText("");textField_7.setText("");textField_8.setText("");
					textField_9.setText("");textPane.setText("");
				}
				else
				{
					JOptionPane.showMessageDialog(btnAddStudent, AddStudent.this,"Sorry, Unable to add student!", status);
				}
			}
		});
		
		btnAddStudent.setBounds(233, 467, 162, 27);
		frame.getContentPane().add(btnAddStudent);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Accountantsection.main(new String[]{});
				frame.dispose();
			}
		});
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnBack.setBounds(18, 468, 92, 25);
		frame.getContentPane().add(btnBack);
		
	}
}
