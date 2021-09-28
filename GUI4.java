package oopsWithGui;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI4 implements ActionListener{
	static ArrayList<String> a=new ArrayList<String>();
	
	private JLabel l0,l1,l2,l3;
	private JTextField  t1;
	private JTextArea t2;
	private JButton b1,b2;
	private JPasswordField pas;
	
	GUI4(){
		
		JPanel panel=new JPanel();
		panel.setBackground(Color.YELLOW);
		JFrame frame=new JFrame("Register::LOGIN:::");
        frame.setSize(1100,600);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.setLayout(null);
		
		l0=new JLabel("TYPE ID and PASSWORD TO CHECK REGISTER ");
		l0.setBounds(100, 20, 1000, 50);
		l0.setFont(new Font("serief",Font.BOLD,40));
		l0.setForeground(Color.GREEN);
		panel.add(l0);
		
		l1=new JLabel("ID:");
		l1.setBounds(100, 80, 50, 25);
		l1.setFont(new Font("serief",Font.BOLD,15));
		l1.setForeground(Color.RED);
		panel.add(l1);
		
		t1=new JTextField();
		t1.setBounds(170, 80, 150, 25);
		panel.add(t1);
		
		l2=new JLabel("PASSWORD:");
		l2.setBounds(100, 120, 110, 25);
		l2.setFont(new Font("serief",Font.BOLD,15));
		l2.setForeground(Color.RED);
		panel.add(l2);
		
		pas=new JPasswordField();
		pas.setBounds(220, 120, 160, 25);
		panel.add(pas);
		
		l3=new JLabel("Result: details");
		l3.setBounds(100, 160, 100, 25);
		panel.add(l3);
		
		t2=new JTextArea();
		t2.setBounds(80,189, 800, 320);
		panel.add(t2);
		
		b1=new JButton("Login");
		b1.setBounds(200,160,90,25);
		b1.addActionListener(this);
		panel.add(b1);
	
		frame.setVisible(true);
	
}
	
public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==b1) {
			if(t1.getText().equals("Aishik")&&pas.getText().equals("xyz123")) {
				
				
				try {
					
					 File f= new File("C:\\Users\\aishi\\eclipse-workspace\\oopsWithGui\\src\\oopsWithGui\\Data.txt");
					 Scanner sf=new Scanner(f);
					 while(sf.hasNextLine()) {
						 String line=sf.nextLine();
						 t2.append(line+"\n\n");
					 }
						
				} catch (FileNotFoundException e1) {
					System.out.println("file not found");
				}	
				
		}
				
		
	}

}
}