package _11_whack_a_mole;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Moles implements ActionListener {

	int randNum;
	int hits = 0;
	int misses = 0;

	Date startTime = new Date();

	Random r = new Random();

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();

	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton button5 = new JButton();
	JButton button6 = new JButton();
	JButton button7 = new JButton();
	JButton button8 = new JButton();
	JButton button9 = new JButton();

	JButton list[] = { button1, button2, button3, button4, button5, button6, button7, button8, button9 };

	void createUI() {

		for (int i = 0; i < 9; i++) {
			panel.add(list[i]);
			list[i].addActionListener(this);
		}

		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 200);

	}

	void drawButtons() {
		randomize();
		for (int i = 0; i < 9; i++) {
			list[i].setText("");
		}
		list[randNum].setText("Mole!");
	}

	void randomize() {
		randNum = r.nextInt(9);
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
		System.out.println(timeAtEnd);
		System.out.println(timeAtStart);
		System.out.println(molesWhacked);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource().equals(list[randNum])) {
			System.out.println("Mole!");
			hits++;
		} else {
			System.out.println("Incorrect!");
			misses++;
		}
		
		
		if(misses>4) {
			System.out.println("You Lost!");
		}else if (hits < 10) {
			drawButtons();
		} else {
			endGame(startTime, 10);
		}
	}

}
