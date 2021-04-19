package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Surprise implements ActionListener {
	JFrame frame = new JFrame();

	JPanel panel = new JPanel();
	static JButton b1 = new JButton("Trick");
	static JButton b2 = new JButton("Treat");

	public static void main(String[] args) {

		new Surprise().createUI();

	}

	void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(b1);
		panel.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
		frame.pack();
	}

	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("preseed");
		if (arg0.getSource().equals(b1)) {
			System.out.println("B1");
			showPictureFromTheInternet("https://www.google.com/imgres?imgurl=https%3A%2F%2Fhips.hearstapps.com%2Fcountryliving.cdnds.net%2F17%2F47%2F1511194376-cavachon-puppy-christmas.jpg&imgrefurl=https%3A%2F%2Fwww.countryliving.com%2Fuk%2Fwildlife%2Fpets%2Fadvice%2Fa2899%2Fbuying-puppy-tips%2F&tbnid=p9Awt4pKLmoyRM&vet=12ahUKEwiIiOOFiIvwAhUQtJ4KHSSmC1cQMygDegUIARD7AQ..i&docid=-VB39TAZEEKv_M&w=2121&h=1414&itg=1&q=puppy&client=ubuntu&ved=2ahUKEwiIiOOFiIvwAhUQtJ4KHSSmC1cQMygDegUIARD7AQ");
		}
		if (arg0.getSource().equals(b2)) {
			System.out.println("B2");
		}
	}
}
