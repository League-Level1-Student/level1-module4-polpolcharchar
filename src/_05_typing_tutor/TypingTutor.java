package _05_typing_tutor;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TypingTutor implements KeyListener {
	char currentLetter;

	public static void main(String[] args) {
		TypingTutor t = new TypingTutor();
		t.setup();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	int keypresses = 0;
	int corrects = 0;

	void setup() {

		currentLetter = generateRandomLetter();

		label.setText(currentLetter + "");
		label.setFont(label.getFont().deriveFont(28.0f));
		label.setHorizontalAlignment(JLabel.CENTER);

		frame.addKeyListener(this);

		panel.add(label);
		frame.add(panel);

		frame.setVisible(true);
		frame.setSize(200, 200);
	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	Date timeAtStart = new Date();
    
	private void showTypingSpeed(int numberOfCorrectCharactersTyped) {
	    Date timeAtEnd = new Date();
	    long gameDuration = timeAtEnd.getTime() - timeAtStart.getTime();
	    long gameInSeconds = (gameDuration / 1000) % 60;
	    double charactersPerSecond = ((double) numberOfCorrectCharactersTyped / (double) gameInSeconds);
	    int charactersPerMinute = (int) (charactersPerSecond * 60);
	    System.out.println("Your typing speed is " + charactersPerMinute + " characters per minute.");
	} 
	
	
	
	
	
	
	
	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(arg0.getKeyChar());
		keypresses++;
		if(arg0.getKeyChar()==currentLetter) {
			System.out.println("Correct!");
			panel.setBackground(Color.GREEN);
			corrects++;
		}
		else {
			panel.setBackground(Color.RED);
		}
		if(keypresses%15 == 0) {
			showTypingSpeed(corrects);
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		currentLetter = generateRandomLetter();
		label.setText(currentLetter+"");
		

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
