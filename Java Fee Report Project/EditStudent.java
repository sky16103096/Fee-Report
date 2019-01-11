import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.Color;

public class EditStudent {

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
	private JTextField textField_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EditStudent window = new EditStudent();
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
	public EditStudent() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 498, 565);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblEditStudent = new JLabel("EDIT STUDENT");
		lblEditStudent.setBounds(63, 0, 369, 24);
		lblEditStudent.setHorizontalAlignment(SwingConstants.CENTER);
		lblEditStudent.setFont(new Font("Times New Roman", Font.BOLD, 20));
		frame.getContentPane().add(lblEditStudent, BorderLayout.NORTH);
		
		JLabel label = new JLabel("NAME");
		label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label.setBounds(37, 81, 47, 18);
		frame.getContentPane().add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(181, 81, 251, 22);
		frame.getContentPane().add(textField);
		
		JLabel label_1 = new JLabel("EMAIL ");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_1.setBounds(37, 113, 56, 18);
		frame.getContentPane().add(label_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(181, 112, 251, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel label_2 = new JLabel("COURSE");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_2.setBounds(37, 144, 63, 18);
		frame.getContentPane().add(label_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(181, 142, 251, 22);
		frame.getContentPane().add(textField_2);
		
		JLabel label_3 = new JLabel("FEE");
		label_3.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_3.setBounds(37, 174, 29, 18);
		frame.getContentPane().add(label_3);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(181, 172, 251, 22);
		frame.getContentPane().add(textField_3);
		
		JLabel label_4 = new JLabel("PAID");
		label_4.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_4.setBounds(41, 205, 37, 18);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("DUE");
		label_5.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_5.setBounds(41, 236, 32, 18);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("ADDRESS");
		label_6.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_6.setBounds(41, 267, 70, 18);
		frame.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("CITY");
		label_7.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_7.setBounds(41, 343, 37, 18);
		frame.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("STATE");
		label_8.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_8.setBounds(41, 375, 49, 18);
		frame.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("COUNTRY");
		label_9.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_9.setBounds(41, 407, 76, 18);
		frame.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("CONTACT NO.");
		label_10.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_10.setBounds(44, 438, 107, 18);
		frame.getContentPane().add(label_10);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(181, 436, 251, 22);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(181, 405, 251, 22);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(181, 373, 251, 22);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(181, 341, 251, 22);
		frame.getContentPane().add(textField_7);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(181, 267, 251, 61);
		frame.getContentPane().add(textPane);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(181, 234, 251, 22);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(181, 203, 251, 22);
		frame.getContentPane().add(textField_9);
		
		JButton btnEditStudent = new JButton("EDIT STUDENT");
		btnEditStudent.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnEditStudent.setBounds(226, 478, 174, 27);
		frame.getContentPane().add(btnEditStudent);
		btnEditStudent.addActionListener(new ActionListener() 
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
				int rollno=Integer.parseInt(textField_10.getText());
				
				Student s=new Student(rollno,name,email,course,fee,paid,due,address,city,state,country,contactno);
				int status=StudentDao.update(s);
				
				if(status>0){
					JOptionPane.showMessageDialog(btnEditStudent, EditStudent.this,"Student updated successfully!", status);
					Accountantsection.main(new String[]{});
					frame.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(btnEditStudent, EditStudent.this,"Sorry, Unable to add student!", status);
				}
			}
		});
		
		
		JLabel lblRollNumber = new JLabel("ROLL NO.");
		lblRollNumber.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblRollNumber.setBounds(37, 37, 132, 18);
		frame.getContentPane().add(lblRollNumber);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(181, 35, 132, 22);
		frame.getContentPane().add(textField_10);
		
		JButton btnLoadRecord = new JButton("LOAD RECORD");
		btnLoadRecord.setBounds(325, 34, 143, 25);
		frame.getContentPane().add(btnLoadRecord);
		btnLoadRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String srollno=textField_10.getText();
				if(srollno==null||srollno.trim().equals("")){
					JOptionPane.showMessageDialog(btnLoadRecord, EditStudent.this,"Please enter rollno first!", 0);
				}
				else
				{
				int rollno=Integer.parseInt(srollno);
				Student s=StudentDao.getStudentByRollno(rollno);
				
				textField.setText(s.getName());
				textField_1.setText(s.getEmail());
				textField_2.setText(s.getCourse());
				textField_3.setText(String.valueOf(s.getFee()));
				textField_4.setText(String.valueOf(s.getPaid()));
				textField_5.setText(String.valueOf(s.getDue()));
				textPane.setText(s.getAddress());
				textField_6.setText(s.getCity());
				textField_7.setText(s.getState());
				textField_8.setText(s.getCountry());
				textField_9.setText(s.getContactno());
				}
			}
		});
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBounds(36, 66, 396, 2);
		frame.getContentPane().add(separator);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnBack.setBounds(20, 479, 97, 25);
		frame.getContentPane().add(btnBack);
		
		btnBack.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				Accountantsection.main(new String[]{});
				frame.dispose();
			}
		});
		
		
	}
}
