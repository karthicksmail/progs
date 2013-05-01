/*
(Even or Odd) Write a method isEven that uses the remainder operator (%) to determine whether an integer is even. The method should take an integer argument and return true if the integer is even and false otherwise. Incorporate this method into an application that inputs a sequence of integers (one at a time) and determines whether each is even or odd.
*/

import java.util.Scanner;

public class EvenOrOdd {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char ch = 'N';

		do{
			System.out.print("Enter the number: ");
			int num = input.nextInt();
	
			System.out.println("The number " + num + " is " + ((isEven(num) == true)?"even":"odd") + ".");
			System.out.print("Do you want to continue? (Y/N/y/n)");
			ch = input.next().toLowerCase().charAt(0);
		} while ((ch == 'y'));
	}

	public static boolean isEven(int num) {
		if(num % 2 == 0) {
			return true;
		}else{
			return false;
		}
	}
}

