package com.stringcalculator;

import java.util.Scanner;

public class StringCalculator {

	public static void main(String arg[]) {

		Scanner in = new Scanner(System.in);

		String str = in.nextLine();

		StringCalculator calculator = new StringCalculator();

		System.out.print(calculator.Add(str));
	}

	int Add(String numbers) {
		if (numbers.length() <= 0) {
			return 0;
		}
		String[] numbersArray = numbers.replaceAll(",","\n").split("\n");
		int total = 0;
		for (int i = 0; i < numbersArray.length; i++) {
			int num = Integer.parseInt(numbersArray[i]);
			total = total + num;
		}
		return total;
	}

}
