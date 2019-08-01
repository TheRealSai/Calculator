package com.flexon.sai.calculator;

import java.util.Scanner;

public class IntegerCalculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter number 1:");
		Integer d1 = sc.nextInt();
		System.out.println("Enter number 2:");
		Integer d2 = sc.nextInt();
		
		System.out.println("What do you want to do? \n 1. add \n 2. subtract \n 3. Multiply \n 4. Divide \n 5. Mod");
		
		int math = sc.nextInt();
		
		//System.out.println(Calc(d1,d2,math));
		
		
	}
	
	private static Integer Calc(Integer d1, Integer d2, int math){
		
		
		switch (math){
		case 1: 
			return sum(d1, d2);
		case 2: 
			return sub(d1, d2);
		case 3: 
			return mult(d1, d2);
		case 4: 
			return div(d1,d2);
		case 5: 
			return mod(d1, d2);
		}
		
		return 0;
	}
	public static Integer sum(Integer x, Integer y) {
		
		return x+y;
	}
	public static Integer sub(Integer x, Integer y) {
	
		return x-y;
	}
	public static Integer mult(Integer x, Integer y) {
	
		return x*y;
	}
	public static Integer div(Integer x, Integer y) {
		
		return x/y;
	}
	public static Integer mod(Integer x, Integer y) {
		
		return x%y;
	}
}
