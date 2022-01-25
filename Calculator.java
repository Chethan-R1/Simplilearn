package com.simpli.first;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n1 = sc.nextInt();
		System.out.println("Ener Another number");
		int n2 = sc.nextInt();
		int operater = sc.nextInt();
		if(operater == 1) {
			System.out.println(n1+n2);
		}
		else if(operater == 2) {
			System.out.println(n1*n2);
		}
		else if(operater == 3) {
			System.out.println(n1-n2);
		}
		else {
			System.out.println(n1/n2);
		}
	}
}
