package kr.re.ec.seleniumexample.java;

public class Main {
	public static void main(String[] args) {
		try {
			new SeleniumExample().start();
		} catch (InterruptedException e) {
			System.out.println("FATAL: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
