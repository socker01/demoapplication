package com.jirikoudelka.demoapplication;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 * Demo application
 *
 * This class tests the correct settings of the development tools
 *
 * @author Jiri Koudelka
 * @since 14.02.2020
 */
final class DemoApplication {

	private static final int WINDOW_SIZE = 200;
	private static final int WINDOW_LOCATION = 400;

	public static void main(String[] args) {
		renderWindow();
	}

	static void renderWindow() {
		JFrame window = initializeWindow();
		JLabel label = initializeLabel();

		window.add(label);
		window.setVisible(true);
	}

	private static JLabel initializeLabel() {
		return new JLabel("(5 + 1) + (4 * 2) = " + (addTwoNumbers(5, 1) + multiplyTwoNumbers(4, 2)), SwingConstants.CENTER);
	}

	private static JFrame initializeWindow() {
		JFrame window = new JFrame();
		window.setSize(WINDOW_SIZE, WINDOW_SIZE);
		window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		window.setLocation(WINDOW_LOCATION, WINDOW_LOCATION);

		return window;
	}

	static int addTwoNumbers(int number1, int number2) {
		return number1 + number2;
	}

	static int multiplyTwoNumbers(int number1, int number2) {
		return number1 * number2;
	}
}
