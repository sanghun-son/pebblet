package PEBBLET;

import javax.swing.*;

import com.sun.tools.javah.MainDoclet;


public class mainUI extends JFrame{
	public mainUI(){
		
		setTitle("PEBBLET");
		setSize(1500,1000);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run(){
				mainUI ex = new mainUI();
				ex.setVisible(true);
			}
		}
		);
	}
}