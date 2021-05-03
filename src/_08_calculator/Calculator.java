package _08_calculator;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	String add(int num1, int num2) {
		return Integer.toString(num1 + num2);
	}

	String subtract(int num1, int num2) {
		return Integer.toString(num1 - num2);
	}

	String multiply(int num1, int num2) {
		return Integer.toString(num1 * num2);
	}

	String divide(int num1, int num2) {
		return Integer.toString(num1 / num2);
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField text1 = new JTextField(20);
	JTextField text2 = new JTextField(20);
	JButton button1 = new JButton("Add");
	JButton button2 = new JButton("Subtract");
	JButton button3 = new JButton("Multiply");
	JButton button4 = new JButton("Divide");
	JLabel label = new JLabel();

	void createUI() {
		frame.add(panel);
		panel.add(text1);
		panel.add(text2);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(label);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.pack();

		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		
		text1.setText("");
		text2.setText("");
		
		text1.setToolTipText("First Number");
		text2.setToolTipText("Second Number");
		
		text1.setCaretColor(Color.BLUE);
		text2.setCaretColor(Color.RED);
		text1.setSelectedTextColor(Color.RED);
		text2.setSelectedTextColor(Color.GREEN);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if (arg0.getSource().equals(button1)) {
			System.out.println("Add");
			//System.out.println(add(Integer.parseInt(text1.getText()),
					 //Integer.parseInt(text2.getText())));
			label.setText(add(Integer.parseInt(text1.getText()),
					 Integer.parseInt(text2.getText())));
		} else if (arg0.getSource().equals(button2)) {
			System.out.println("Subtract");
			//System.out.println(subtract(Integer.parseInt(text1.getText()),
					 //Integer.parseInt(text2.getText())));
			label.setText(subtract(Integer.parseInt(text1.getText()),
					 Integer.parseInt(text2.getText())));
		} else if (arg0.getSource().equals(button3)) {
			System.out.println("Multiply");
			//System.out.println(multiply(Integer.parseInt(text1.getText()),
					 //Integer.parseInt(text2.getText())));
			label.setText(multiply(Integer.parseInt(text1.getText()),
					 Integer.parseInt(text2.getText())));
		} else if (arg0.getSource().equals(button4)) {
			System.out.println("Divide");
			 //System.out.println(divide(Integer.parseInt(text1.getText()),
			 //Integer.parseInt(text2.getText())));
			 label.setText(divide(Integer.parseInt(text1.getText()),
			 Integer.parseInt(text2.getText())));
			 
		}

	}
}
