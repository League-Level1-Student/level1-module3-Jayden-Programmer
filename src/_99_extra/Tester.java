package _99_extra;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tester {
public static void main(String[] args) {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel(); 
	JButton button = new JButton(); 
	
	frame.add(panel); 
	panel.add(button); 
	frame.pack();
	frame.setVisible(true);
	button.addKeyListener(this);
	button.addActionListener(this);

button.addKeyListener(this);
button.actionperformed(this); 
}
}
