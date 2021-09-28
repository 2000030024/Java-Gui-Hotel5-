package oopsWithGui;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Guiu implements ActionListener {
static	JFrame frame;
	private static JLabel l1,l2,l3,l4;
	private static JButton b1,b2,b3;
	
	public static void main(String[] args)throws Exception {
		
		JPanel panel=new JPanel();
		frame=new JFrame("***** REGISTER BOOK *****");
		frame.setSize(700,500);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		
		panel.setLayout(null);
		panel.setBackground(Color.PINK);
		
		l1=new JLabel("*****HOTEL FIVE STAR*****");
		l1.setBounds(90, 20, 550, 50);
		l1.setFont(new Font("serief",Font.BOLD,40));
		l1.setForeground(Color.BLUE);
		panel.add(l1);
		
		l2=new JLabel("ENTER NEW RECORD|");
		l2.setFont(new Font("serief",Font.ITALIC,15));
		l2.setForeground(Color.GREEN);
		l2.setBounds(70,150,200,25);
		panel.add(l2);
		
		l3=new JLabel("|ENTER NAME TO SEARCH|");
		l3.setFont(new Font("serief",Font.ITALIC,15));
		l3.setForeground(Color.YELLOW);
		l3.setBounds(240, 150, 210, 25);
		panel.add(l3);
		
		l4=new JLabel("| SHOW ALL IN REGISTER");
		l4.setFont(new Font("serief",Font.ITALIC,15));
		l4.setForeground(Color.RED);
		l4.setBounds(445, 150, 200, 25);
		panel.add(l4);
		
		b1=new JButton("NEW");
		b1.setBounds(120,180,90,25);
		b1.addActionListener(new Guiu());
		panel.add(b1);
		
		b2=new JButton("SEARCH");
		b2.setBounds(270,180,100,25);
		b2.addActionListener(new Guiu());
		panel.add(b2);
		
		b3=new JButton("REGISTER");
		b3.setBounds(465,180,100,25);
		b3.addActionListener(new Guiu());
		panel.add(b3);
		
		
		frame.setVisible(true);

	}   
		
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==b1) {
		
			GUI2 g2=new GUI2();
			
		}
		else if(e.getSource()==b2) {
			GUI3 g3=new GUI3();
		}
		else if(e.getSource()==b3) {
			GUI4 g=new GUI4();
		}
		
	}

}

