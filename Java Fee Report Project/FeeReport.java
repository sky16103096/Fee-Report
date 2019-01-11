import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FeeReport {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FeeReport window = new FeeReport();
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
	public FeeReport() {
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
		
		JLabel lblFeeReport = new JLabel("FEE REPORT");
		lblFeeReport.setHorizontalAlignment(SwingConstants.CENTER);
		lblFeeReport.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblFeeReport.setBounds(149, 24, 144, 34);
		frame.getContentPane().add(lblFeeReport);
		
		JButton btnNewButton = new JButton("ADMIN LOGIN");
		btnNewButton.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				AdminLogin.main(new String[]{});
				frame.dispose();				
			}
		});
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.setBounds(116, 88, 204, 45);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAccountantLogin = new JButton("ACCOUNTANT LOGIN");
		btnAccountantLogin.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0) 
			{
				AccountantLogin.main(new String[]{});
				frame.dispose();
			}
		});
		btnAccountantLogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAccountantLogin.setBounds(116, 160, 204, 45);
		frame.getContentPane().add(btnAccountantLogin);
	}

}
