package lab10;

import java.awt.*;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator_Swing {

	JFrame frame;
	JPanel topPanel;
	JPanel buttonPanel;
	Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	Button plus, minus, div, mul, cancel;
	Button equal;
	JTextField tf;

	int number1 = 0;
	int number2 = 0;

	char PLUS = '+';
	char MINUS = '-';
	char DIV = '/';
	char MUL = '*';

	char operation;

	Calculator_Swing() {
		frame = new JFrame("Calculator...!");
		topPanel = new JPanel();
		buttonPanel = new JPanel();

		tf = new JTextField();
		tf.setPreferredSize(new Dimension(350, 50));
		// edit box panel
		topPanel.setLayout(new FlowLayout());
		topPanel.add(tf);

		b0 = new Button("0");
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");

		plus = new Button("+");
		minus = new Button("-");
		div = new Button("/");
		mul = new Button("*");
		equal = new Button("=");
		cancel = new Button("C");

		// button panel
		buttonPanel.setLayout(new GridLayout(4, 4));
		buttonPanel.add(b0);
		buttonPanel.add(b1);
		buttonPanel.add(b2);
		buttonPanel.add(b3);
		buttonPanel.add(b4);
		buttonPanel.add(b5);
		buttonPanel.add(b6);
		buttonPanel.add(b7);
		buttonPanel.add(b8);
		buttonPanel.add(b9);
		buttonPanel.add(plus);
		buttonPanel.add(minus);
		buttonPanel.add(div);
		buttonPanel.add(mul);
		buttonPanel.add(equal);
		buttonPanel.add(cancel);

		// set layout for frame
		frame.setLayout(new BorderLayout());
		// add top panle at top (north)
		frame.add(topPanel, BorderLayout.NORTH);
		// add button panle at entre
		frame.add(buttonPanel, BorderLayout.CENTER);

		frame.setSize(400, 400);

		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		b0.addActionListener(listener);
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		b5.addActionListener(listener);
		b6.addActionListener(listener);
		b7.addActionListener(listener);
		b8.addActionListener(listener);
		b9.addActionListener(listener);

		plus.addActionListener(listener);
		minus.addActionListener(listener);
		div.addActionListener(listener);
		mul.addActionListener(listener);
		cancel.addActionListener(listener);
		equal.addActionListener(listener);

	}

	

	ActionListener listener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			Button b = (Button) e.getSource();
			if (b == cancel) {
				tf.setText("");
				number1 = number2 = 0;
				operation = ' ';
				return;
			} 
			
			if (b == equal) {
				
				number2 = Integer.parseInt(tf.getText());

				int result = 0;
				if (operation == PLUS) {	
					result = number1 + number2; 
				} else if (operation == MINUS) {
					result = number1 - number2; 
				} else if (operation == DIV) {
					result = number1 / number2; 
				} else if (operation == MUL) {
					result = number1 * number2; 					
				}  
				tf.setText(String.valueOf(result));
				return;
			} 
			 
		
			if (b == plus) {
				operation = PLUS;
				number1 = Integer.parseInt(tf.getText());
				System.out.println("number1 " + number1);
				tf.setText(null);
				
			} else if (b == minus) {
				operation = MINUS;
				number1 = Integer.parseInt(tf.getText());
				System.out.println("number1 " + number1);
				tf.setText(null);
			} else if (b == div) {
				operation = DIV;
				number1 = Integer.parseInt(tf.getText());
				System.out.println("number1 " + number1);
				tf.setText(null);
			} else if (b == mul) {
				operation = MUL;
				number1 = Integer.parseInt(tf.getText());
				System.out.println("number1 " + number1);
				tf.setText(null);
			} else {
				System.out.println(b.getActionCommand());
				tf.setText(tf.getText() + b.getActionCommand());
			}
		
		}
	};

	public static void main(String[] args) {
		Calculator_Swing cal = new Calculator_Swing();
	}
}
