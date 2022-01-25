package com.simpli.first;

public class Honda {
	public static void main(String[] args) {
		Car c = new Car() {
			public void stop() {
				System.out.println("Started");
			}
			public void start() {
				System.out.println("stop");
			}
		};
		c.start();
		c.stop();
	}
}
