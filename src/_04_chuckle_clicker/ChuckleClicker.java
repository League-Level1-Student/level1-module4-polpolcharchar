package _04_chuckle_clicker;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	public static void main(String[] args) {
ChuckleClicker c = new ChuckleClicker();
c.createButtons();
	}
	
	
	
	
	JButton button1 = new JButton("Joke");
	JButton button2 = new JButton("Punchline");
	
	void createButtons() {
		//System.out.println("Make Buttons");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		
		button1.addActionListener(this);
		button2.addActionListener(this);
		
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		
		frame.setVisible(true);
		frame.setSize(200, 200);
	}






	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource()==button1) {
			JOptionPane.showMessageDialog(null, "What's a whale's favorite game?");
		}
		if(arg0.getSource()==button2) {
			JOptionPane.showMessageDialog(null, "Swallow the leader!");
		}
	}
}
