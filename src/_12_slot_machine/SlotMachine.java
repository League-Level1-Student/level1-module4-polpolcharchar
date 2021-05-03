package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {

	String images[] = {"cherry.jpeg", "orange.jpeg", "lime.jpeg"};
	
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Spin!");
	JLabel pic1;
	JLabel pic2;
	JLabel pic3;
	
	void createUI() {
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
