package _12_slot_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.util.Random;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {

	String images[] = {"cherry.jpeg", "orange.jpeg", "lime.jpeg"};
	
	Random r = new Random();			
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Spin!");
	JLabel pic1 = new JLabel();
	JLabel pic2 = new JLabel();
	JLabel pic3 = new JLabel();
	
	
	int index1;
	int index2;
	int index3;
	
	JLabel labels[] = {pic1, pic2, pic3};
	
	void createUI() throws MalformedURLException {
		frame.setVisible(true);
		
		
		frame.add(panel);
		panel.add(button);
		button.addActionListener(this);
		
		spin();
		panel.add(pic1);
		panel.add(pic2);
		panel.add(pic3);
		
		
		
		frame.setSize(1000, 300);
		
	}

	private void createLabelImage(String fileName, JLabel label) throws MalformedURLException{
        java.net.URL imageURL = getClass().getResource(fileName);
	if (imageURL == null){
		System.err.println("Could not find image " + fileName);
	}
	Icon icon = new ImageIcon(imageURL);
	label.setIcon(icon);
	}
	
	void spin() throws MalformedURLException {
		
		//frame.removeAll();
		//frame.add(button);
		//button.addActionListener(this);
		
	index1 = r.nextInt(3);
	index2 = r.nextInt(3);
	index3 = r.nextInt(3);
		
		
		createLabelImage(images[index1], pic1);
		createLabelImage(images[index2], pic2);
		createLabelImage(images[index3], pic3);
		
		
		frame.pack();
		
		if(index1==index2 && index1 == index3) {
			System.out.println("YOU WIN");
		}
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("pressed");
		try {
			
			spin();
			//System.out.println("spin");
		} catch (MalformedURLException e1) {
			// TODO Auto-generated catch block
			//System.out.println("caught");
			e1.printStackTrace();
		}
	}
	
}
