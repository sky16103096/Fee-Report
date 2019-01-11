import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewAccountant {

	private JFrame frmViewAccountant;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewAccountant window = new ViewAccountant();
					window.frmViewAccountant.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewAccountant() 
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmViewAccountant = new JFrame();
		frmViewAccountant.setTitle("View Accountant");
		frmViewAccountant.setBounds(100, 100, 754, 337);
		frmViewAccountant.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Code to view data in JTable
				List<Accountant> list=AccountantDao.view();
				int size=list.size();
				
				String data[][]=new String[size][5];
				int row=0;
				for(Accountant a:list){
					data[row][0]=String.valueOf(a.getId());
					data[row][1]=a.getName();
					data[row][2]=a.getPassword();
					data[row][3]=a.getEmail();
					data[row][4]=a.getContactno();
					row++;
				}
				String columnNames[]={"Id","Name","Password","Email","Contact No"};
				frmViewAccountant.getContentPane().setLayout(null);
				
				JTable jt=new JTable(data,columnNames);
				jt.setFont(new Font("Times New Roman", Font.BOLD, 15));
				jt.setBackground(Color.LIGHT_GRAY);
				JScrollPane sp=new JScrollPane(jt);
				sp.setBounds(12, 51, 712, 226);
				frmViewAccountant.getContentPane().add(sp);
				
				JButton btnNewButton = new JButton("BACK");
				btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
				btnNewButton.setBounds(12, 13, 96, 25);
				frmViewAccountant.getContentPane().add(btnNewButton);
				btnNewButton.addActionListener(new ActionListener() 
				{
					public void actionPerformed(ActionEvent e) 
					{
						AdminSection.main(new String[]{});
						frmViewAccountant.dispose();
					}
				});
				
	}
}
