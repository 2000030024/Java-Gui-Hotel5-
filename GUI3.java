package oopsWithGui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI3 implements ActionListener {
	
	
	private JLabel l0,l1,l3;
	private JTextField  t1,t2;
	private JButton b1,b2;
	
	GUI3(){
		
		JPanel panel=new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		JFrame frame=new JFrame("SEARCHING...");
        frame.setSize(900,500);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		l0=new JLabel("TYPE A NAME TO SEARCH DETAILS");
		l0.setBounds(100, 20, 700, 50);
		l0.setFont(new Font("serief",Font.BOLD,40));
		l0.setForeground(Color.GREEN);
		panel.add(l0);
		
		l1=new JLabel("Name:");
		l1.setBounds(100, 80, 50, 25);
		l1.setFont(new Font("serief",Font.BOLD,15));
		l1.setForeground(Color.RED);
		panel.add(l1);
		
		t1=new JTextField();
		t1.setBounds(200, 80, 150, 25);
		panel.add(t1);
		
		b1=new JButton("SEARCH");
		b1.setBounds(360,80,90,25);
		b1.addActionListener(this);
		panel.add(b1);
		
		l3=new JLabel("RESULT...");
		l3.setBounds(100,120,100,25);
		l3.setFont(new Font("serief",Font.ITALIC,15));
		l3.setForeground(Color.BLUE);
		panel.add(l3);
		
		t2=new JTextField();
		t2.setBounds(80,150, 800, 120);
		panel.add(t2);
		
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			Scanner sf;

			try {
				FileInputStream fis=new FileInputStream("C:\\Users\\aishi\\eclipse-workspace\\oopsWithGui\\src\\oopsWithGui\\Data.txt");
				String name=t1.getText();
				int flag=0,j=0;
				String n;
				StringTokenizer st;
				sf=new Scanner(fis);
				
			while(sf.hasNextLine()) 
				{
					n=sf.nextLine();
					j=0;
					
					st=new StringTokenizer(n);
					
					int not=st.countTokens();
					
					String str[]=new String[not];
					while(st.hasMoreTokens()) {
						str[j]=st.nextToken();
						j++;
					}
					if(str[1].equalsIgnoreCase(name)) {
						flag=1;
						t2.setText("Searched details::" +n);
						sf.close();
						
						break;
					}
					
				}
				if(flag==0)
					t2.setText("name not found ");
				
				
				
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
			
		}
		
	}
	
	

}
