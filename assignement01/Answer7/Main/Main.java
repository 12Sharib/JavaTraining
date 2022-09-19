package assignement01.Answer7.Main;

import java.util.Scanner;

import assignement01.Answer7.Operations.Answer7;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Answer7 save = new Answer7();
			System.out.print("Enter the number for evenNumbers : ");
			int number = sc.nextInt();
			save.saveEvenNumbers(number);
		
	}

}
