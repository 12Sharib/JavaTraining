package assignement01.Answer1.Main;

import java.util.Scanner;

import assignement01.Answer1.Operations.Operations;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Operations save = new Operations();
			System.out.print("Enter the number for evenNumbers : ");
			int number = sc.nextInt();
			save.saveEvenNumbers(number);
		
	}
}
