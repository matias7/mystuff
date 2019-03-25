package main;

import java.awt.FlowLayout;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	 private static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("e-Moon client");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        

	        //Add the ubiquitous "Hello World" label.
	        
	        JFormattedTextField userField = new JFormattedTextField();
	       
	        
	        JPanel panel = new JPanel();
	        panel.setLayout(new FlowLayout());
	        
	        panel.add(userField);

	        //Display the window.
	        frame.getContentPane().add(panel);
	        frame.setSize(500, 500);
	        frame.setVisible(true);
	    }
	
	public static void main(String[] args) {
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
	}

}
