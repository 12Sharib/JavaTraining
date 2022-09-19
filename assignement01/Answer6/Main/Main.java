package assignement01.Answer6.Main;

import java.util.Scanner;

import assignement01.Answer6.Operations.Operations;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Operations save = new Operations();
			System.out.print("Enter the number for evenNumbers : ");
			Integer number = sc.nextInt();
			save.saveEvenNumbers(number);
		
	}
}
