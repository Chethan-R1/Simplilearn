package com.simpli.first;

public class Sum10 {
	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++) {
			int sum = 0;
			int count = 0;
			sum=sum+i;
			count = count + sum;
			System.out.println(sum);
			System.out.println(count);
		}
	}
}
