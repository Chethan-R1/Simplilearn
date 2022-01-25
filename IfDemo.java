package com.simpli.first;
import java.util.*;
public class IfDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		int n1 = sc.nextInt();
		System.out.println("Enter Second number:");
		int n2 = sc.nextInt();
		if(n1>n2) {
			System.out.println(n1+"is larger");
		}
		else {
			System.out.println(n2+"is Larger");
		}
	}
}
