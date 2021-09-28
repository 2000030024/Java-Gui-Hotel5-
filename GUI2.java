package oopsWithGui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class GUI2 implements ActionListener{
	static JFrame frame;
	private JLabel l0,l1,l2,l3,l4,l5,l6,l7;
	private JTextField  t1,t2,t3,t4,t5,t6,t7;
	private JButton b1,b2;
	
	GUI2(){
		JPanel panel=new JPanel();
		panel.setBackground(Color.CYAN);
		frame=new JFrame("****MAKE A RECORD****");
        frame.setSize(600,500);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		l0=new JLabel("ENTER NEW RECORD");
		l0.setBounds(100, 20, 500, 50);
		l0.setFont(new Font("serief",Font.BOLD,40));
		l0.setForeground(Color.ORANGE);
		panel.add(l0);
		
		l1=new JLabel("Name:");
		l1.setBounds(100, 80, 50, 25);
		l1.setFont(new Font("serief",Font.BOLD,15));
		l1.setForeground(Color.RED);
		panel.add(l1);
		
		t1=new JTextField();
		t1.setBounds(200, 80, 150, 25);
		panel.add(t1);
		
		l2=new JLabel("AGE:");
		l2.setBounds(100, 120, 50, 25);
		l2.setFont(new Font("serief",Font.BOLD,15));
		l2.setForeground(Color.RED);
		panel.add(l2);
		
		t2=new JTextField();
		t2.setBounds(200, 120, 90, 25);
		panel.add(t2);
		
		l3=new JLabel("GENDER:");
		l3.setBounds(100, 160, 100, 25);
		l3.setFont(new Font("serief",Font.BOLD,15));
		l3.setForeground(Color.RED);
		panel.add(l3);
		
		t3=new JTextField();
		t3.setBounds(200, 160, 80, 25);
		panel.add(t3);
		
		l4=new JLabel("ROOM NO:");
		l4.setBounds(100, 200, 100, 25);
		l4.setFont(new Font("serief",Font.BOLD,15));
		l4.setForeground(Color.RED);
		panel.add(l4);
		
		t4=new JTextField();
		t4.setBounds(200, 200, 80, 25);
		panel.add(t4);
		
		l5=new JLabel("NO OF PEOPLE:");
		l5.setBounds(100, 240, 150, 25);
		l5.setFont(new Font("serief",Font.BOLD,15));
		l5.setForeground(Color.RED);
		panel.add(l5);
		
		t5=new JTextField();
		t5.setBounds(250, 240, 90, 25);
		panel.add(t5);

		l6=new JLabel("CHECK IN DATE:");
		l6.setBounds(100, 280, 150, 25);
		l6.setFont(new Font("serief",Font.BOLD,15));
		l6.setForeground(Color.RED);
		panel.add(l6);
		
		t6=new JTextField();
		t6.setBounds(250, 280, 150, 25);
		panel.add(t6);
		
		l7=new JLabel("CHECK OUT DATE:");
		l7.setBounds(100, 320, 150, 25);
		l7.setFont(new Font("serief",Font.BOLD,15));
		l7.setForeground(Color.RED);
		panel.add(l7);
		
		t7=new JTextField();
		t7.setBounds(250, 320, 150, 25);
		panel.add(t7);
		
		b1=new JButton("CREATE");
		b1.setBounds(300, 400, 100, 30);
		panel.add(b1);
		
		b2=new JButton("CANCEL");
		b2.setBounds(180,400,100,30);
		panel.add(b2);
		
		
		frame.setVisible(true);				
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
			
			try {
				File f=new File("C:\\Users\\aishi\\eclipse-workspace\\oopsWithGui\\src\\oopsWithGui\\Data.txt");
				FileWriter fw = new FileWriter(f,true);
				PrintWriter p=new PrintWriter(fw);
				p.write("Name: "+t1.getText()+" Age : "+t2.getText()+" Gender : "+t3.getText()+" Room no : "+t4.getText()+" Number of person : "+t5.getText());
				p.println();
				p.close();
				fw.close();
				JOptionPane.showMessageDialog(null,"saved successfully");
			} catch (Exception e1) {
				System.out.println("file not found");
				
			}
			
	}//if b1
		
		if(e.getSource()==b2) {
			frame.dispose();
		}
		
	}
}