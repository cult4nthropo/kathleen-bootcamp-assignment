package com.coderscampus.prepcourse;

import java.util.Scanner;

public class CompoundInterestCalculationApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BankAccount bankAccount = new BankAccount();
		
		System.out.println("How much money do you want to invest? ");
		bankAccount.setInvestment(parseInputToDouble(scanner));
		double investment = bankAccount.getInvestment();
		
		System.out.println("What is the interest rate? ");
		bankAccount.setInterestRate(parseInputToDouble(scanner));
		double interestRate = bankAccount.getInterestRate();
		bankAccount.calculateInvestmentOutput5Years(investment, interestRate);
		scanner.close();
	}
	
	public static double parseInputToDouble (Scanner scanner) {
		double inputValue = 0;
		boolean parsable = false;
		while (!parsable) {
			try {
				String input = scanner.next();
				inputValue = Double.parseDouble(input);
				parsable = true;
			} catch (Exception e) {
				System.out.println("Sorry, this was not a number. Try again: ");
				parsable = false;
			}
		}
		return inputValue;
	}

}
