package Lab12;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator_Swing {

	JFrame frame;
	JPanel pan1, pan2;
	JTextField tf;

	JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	JButton plus, minus, div, mul;
	JButton equal, cancel;

	int num1 = 0, num2 = 0;

	final String PLUS = "plus";
	final String MINUS = "minus";
	final String DIV = "devide";
	final String MUL = "multiply";

	String opCode;

	public Calculator_Swing() {
		
		frame = new JFrame("Calculator ..!");
		frame.setLayout(new BorderLayout());

		// create panlel 1 for text box
		pan1 = new JPanel();
		pan1.setLayout(new FlowLayout());

		tf = new JTextField();
		tf.setPreferredSize(new Dimension(350, 50));

		// add panlel 1 to north of frame
		pan1.add(tf);
		frame.add(pan1, BorderLayout.NORTH);

		// create panlel 2 for all other buttons
		pan2 = new JPanel();
		pan2.setLayout(new GridLayout(4, 4));

		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");

		cancel = new JButton("C");
		plus = new JButton("+");
		minus = new JButton("-");
		div = new JButton("/");
		mul = new JButton("*");
		equal = new JButton("=");

		pan2.add(b0);
		pan2.add(b1);
		pan2.add(b2);
		pan2.add(b3);
		pan2.add(b4);
		pan2.add(b5);
		pan2.add(b6);
		pan2.add(b7);
		pan2.add(b8);
		pan2.add(b9);

		pan2.add(cancel);
		pan2.add(plus);
		pan2.add(minus);
		pan2.add(div);
		pan2.add(mul);
		pan2.add(equal);

		// add panlel 2 to center of the frame
		frame.add(pan2, BorderLayout.CENTER);

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

		cancel.addActionListener(mathButtonlistener);
		plus.addActionListener(mathButtonlistener);
		minus.addActionListener(mathButtonlistener);
		div.addActionListener(mathButtonlistener);
		mul.addActionListener(mathButtonlistener);
		equal.addActionListener(mathButtonlistener);

	}

	// for digit buttons only
	ActionListener listener = new ActionListener() {

		public void actionPerformed(ActionEvent e) {

			JButton b = (JButton) e.getSource();
			String str = tf.getText();
			
			// b.getActionCommand() return the caption on button
			System.out.println(b.getActionCommand());
			tf.setText(str + b.getActionCommand());
		}
	};

	// for calculator operations like plus. minus etc
	ActionListener mathButtonlistener = new ActionListener() {
		public void actionPerformed(ActionEvent e) {

			JButton b = (JButton) e.getSource();

			// handle calcel button
			if (b == cancel) {
				tf.setText(null);
				num1 = num2 = 0;
				opCode = null;
				return;
			}

			// handle plus, minus, div, mul button
			String str = tf.getText();
			if (b == plus) {
				// flag operation code to PLUS
				opCode = PLUS;
				num1 = Integer.parseInt(str);
				System.out.println("num1 " + num1);
				tf.setText(null);
			} else if (b == minus) {
				// flag operation code to MINUS
				opCode = MINUS;
				num1 = Integer.parseInt(str);
				System.out.println("num1 " + num1);
				tf.setText(null);
			} else if (b == div) {
				opCode = DIV;
				num1 = Integer.parseInt(str);
				System.out.println("num1 " + num1);
				tf.setText(null);
			} else if (b == mul) {
				opCode = MUL;
				num1 = Integer.parseInt(str);
				System.out.println("num1 " + num1);
				tf.setText(null);
			}

			// handle equal button
			if (b == equal) {

				num2 = Integer.parseInt(str);
				System.out.println("num2 " + num2);
				int result = 0;
				if (opCode == PLUS) {
					result = num1 + num2;
					System.out.println("result " + result);
					tf.setText(String.valueOf(result));
				} else if (opCode == MINUS) {
					result = num1 - num2;
					System.out.println("result " + result);
					tf.setText(String.valueOf(result));
				} else if (opCode == DIV) {
					result = num1 / num2;
					System.out.println("result " + result);
					tf.setText(String.valueOf(result));
				} else if (opCode == MUL) {
					result = num1 * num2;
					System.out.println("result " + result);
					tf.setText(String.valueOf(result));
				}
			}
		}
	};

	public static void main(String[] args) {
		new Calculator_Swing();
	}

}

