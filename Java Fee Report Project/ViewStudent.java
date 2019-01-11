import java.awt.EventQueue;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewStudent 
{
	private JFrame frame;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewStudent window = new ViewStudent();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public ViewStudent() 
	{
		initialize();
	}

	
	
	private void initialize() 
	{		
		frame = new JFrame();
		frame.setTitle("View Student");
		frame.setBounds(100, 100, 1030, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//Code to view data in JTable
		List<Student> list = StudentDao.view();
		int size = list.size();
		
		String data[][] = new String[size][12];
		int row = 0;
		
		for(Student s:list)
		{
			data[row][0]=String.valueOf(s.getRollno());
			data[row][1]=s.getName();
			data[row][2]=s.getEmail();
			data[row][3]=s.getCourse();
			data[row][4]=String.valueOf(s.getFee());
			data[row][5]=String.valueOf(s.getPaid());
			data[row][6]=String.valueOf(s.getDue());
			data[row][7]=s.getAddress();
			data[row][8]=s.getCity();
			data[row][9]=s.getState();
			data[row][10]=s.getCountry();
			data[row][11]=s.getContactno();
			
			row++;
		}
		
		String columnNames[]={"Rollno","Name","Email","Course","Fee","Paid","Due","Address","City","State","Country","Contact"};
		frame.getContentPane().setLayout(null);
		//getContentPane().setLayout(null);
		
		JTable jt=new JTable(data,columnNames);
		JScrollPane sp=new JScrollPane(jt);
		sp.setBounds(12, 50, 988, 190);
		frame.getContentPane().add(sp);
		
		JButton btnBack = new JButton("BACK");
		btnBack.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnBack.setBounds(12, 13, 97, 25);
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
