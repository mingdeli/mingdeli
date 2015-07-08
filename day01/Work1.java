package day01;

import java.util.Scanner;

public class Work1 {

	public static void main(String[] args) {
		System.out.println("enter a word:");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.nextLine();
		
		System.out.println("hello " + name);
		scanner.close();
	}

}
