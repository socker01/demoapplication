package com.jirikoudelka.demoapplication;

/**
 * Demo application
 *
 * This class tests the correct settings of the development tools
 *
 * @author Jiri Koudelka
 * @since 14.02.2020
 */
final class DemoApplication {

	public static void main(String[] args) {
		System.out.println("5 + 1 = " + addTwoNumbers(5, 1));
		System.out.println("4 * 2 = " + multiplyTwoNumbers(4, 2));
	}

	static int addTwoNumbers(int number1, int number2) {
		return number1 + number2;
	}

	static double multiplyTwoNumbers(int number1, int number2) {
		return number1 * number2;
	}
}
