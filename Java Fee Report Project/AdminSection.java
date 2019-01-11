import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;

//import com.javatpoint.feereport.AddAccountant;
//import com.javatpoint.feereport.FeeReport;
//import com.javatpoint.feereport.ViewAccountant;

import javax.swing.JButton;

public class AdminSection {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSection window = new AdminSection();
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
	public AdminSection() {
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
		
		JLabel lblAdminSection = new JLabel("ADMIN SECTION");
		lblAdminSection.setHorizontalAlignment(SwingConstants.CENTER);
		lblAdminSection.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblAdminSection.setBounds(102, 24, 211, 24);
		frame.getContentPane().add(lblAdminSection);
		
		JButton btnAddAccountant = new JButton("ADD ACCOUNTANT");
		btnAddAccountant.setBounds(124, 61, 168, 41);
		frame.getContentPane().add(btnAddAccountant);
		btnAddAccountant.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				AddAccountant.main(new String[]{});
				frame.dispose();
			}
		});
		
		JButton btnViewAccountant = new JButton("VIEW ACCOUNTANT");
		btnViewAccountant.setBounds(124, 115, 168, 39);
		frame.getContentPane().add(btnViewAccountant);
		btnViewAccountant.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				ViewAccountant.main(new String[]{});
			}
		});
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setBounds(124, 165, 168, 41);
		frame.getContentPane().add(btnLogout);
		btnLogout.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				FeeReport.main(new String[]{});
				frame.dispose();
			}
		});
	}

}
