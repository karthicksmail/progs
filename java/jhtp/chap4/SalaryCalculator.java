/**
 * Problem Statement:
 * (Salary Calculator)
 * Develop a Java application that determines the gross pay for each of three employees.
 * The company pays straight time for the first 40 hours worked by each employee and time and a half for all hours worked in excess of 40.
 * You’re given a list of the employees, their number of hours worked last week and their hourly rates.
 * Your program should input this information for each employee, then determine and display the employee’s gross pay.
 * Use class Scanner to input the data.
 */
import java.util.Scanner;

public class SalaryCalculator {
	public static void main(String[] args) {
		int empId = 0; // Employee ID
		int extraHours = 0; // Number of extra hours
		double normalHourPay = 0.0; // Normal Hour Pay

		Scanner input = new Scanner (System.in);

		for (int i = 0; i < 3; i++) {
			System.out.print("Enter the Employee ID: ");
			empId = input.nextInt();
			System.out.printf("Enter the pay for a normal hour: ");
			normalHourPay = input.nextDouble();
			System.out.printf("Enter the Number of extra hours put in by the employee with ID %d: ", empId);
			extraHours = input.nextInt();

			System.out.printf("The Salary for Employee %d is %.2f\n", empId, (normalHourPay * 40 + extraHours * normalHourPay * 1.5));
		}
	}
}
