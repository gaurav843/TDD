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
		String str2 = numbers.replaceAll("[()?:!.,;{}]+","\n");
		String[] numbersStringArray = str2.replaceAll("( )+","/n").split("\n");
		int[] numberArray = new int[numbersStringArray.length];
	
		
		for (int i = 0 ; i< numbersStringArray.length;i++) {
			int num = Integer.parseInt(numbersStringArray[i]);
			numberArray[i] = num;		
		}
		int[] negatives  = new int[numberArray.length];
		
		for (int k = 0 ;k<numberArray.length;k++) {
			if(numberArray[k]<0) {
				
				negatives[k] = numberArray[k];
					}
		}
		
		if (negatives.length>0) {
			
			
			for(int n = 0;n>negatives.length;n++) {
				if(negatives[n]<0) {
					throw new ArithmeticException("negative not allowed" + negatives );
					
				}
			}
			  
		}
		
		int total = 0;
		for (int j = 0; j < numberArray.length; j++) {
			int num = numberArray[j];
			if (num>1000) {
				total = total + 0;
			}
			else{
			total = total + num;
			}
		}
		return total;
	}

}
