package prac1;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		if (num % 2==0) 
			System.out.println("Even");
		else 
			System.out.println("Odd");

		in.close();
		
	}
}
