import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Accountantsection {

	private JFrame frmAccountantsection;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accountantsection window = new Accountantsection();
					window.frmAccountantsection.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Accountantsection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAccountantsection = new JFrame();
		frmAccountantsection.setTitle("Accounatnt Section");
		frmAccountantsection.setBounds(100, 100, 494, 334);
		frmAccountantsection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAccountantsection.getContentPane().setLayout(null);
		
		JLabel lblAccountant = new JLabel("ACCOUNTANT SECTION");
		lblAccountant.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccountant.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAccountant.setBounds(120, 25, 245, 25);
		frmAccountantsection.getContentPane().add(lblAccountant);
		
		JButton btnAddStudent = new JButton("ADD STUDENT");
		btnAddStudent.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAddStudent.setBounds(70, 90, 159, 30);
		frmAccountantsection.getContentPane().add(btnAddStudent);
		btnAddStudent.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				AddStudent.main(new String[]{});
				frmAccountantsection.dispose();
			}
		});
		
		JButton btnNewStudent = new JButton("VIEW STUDENT");
		btnNewStudent.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewStudent.setBounds(261, 90, 159, 30);
		frmAccountantsection.getContentPane().add(btnNewStudent);
		btnNewStudent.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				ViewStudent.main(new String[]{});
				frmAccountantsection.dispose();
			}
		});
		
		JButton btnEditStudent = new JButton("EDIT STUDENT");
		btnEditStudent.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnEditStudent.setBounds(70, 150, 159, 30);
		frmAccountantsection.getContentPane().add(btnEditStudent);
		btnEditStudent.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				EditStudent.main(new String[]{});
				frmAccountantsection.dispose();
			}
		});
		
		JButton btnDueFee = new JButton("DUE FEE");
		btnDueFee.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnDueFee.setBounds(261, 150, 159, 30);
		frmAccountantsection.getContentPane().add(btnDueFee);
		btnDueFee.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				DueFee.main(new String[]{});
				frmAccountantsection.dispose();
			}
		});
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnLogout.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				FeeReport.main(new String[]{});
				frmAccountantsection.dispose();
			}
		});
		btnLogout.setBounds(185, 211, 140, 30);
		frmAccountantsection.getContentPane().add(btnLogout);
	}
}
