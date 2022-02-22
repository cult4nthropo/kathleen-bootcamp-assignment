package com.coderscampus;

public class BankAccount {
	private double investment;
	
	private double interestRate;
	
	public double getInvestment() {
		return investment;
	}

	public void setInvestment(double investment) {
		this.investment = investment;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		if (interestRate < 100 && interestRate > 0) {
			this.interestRate = interestRate;
		} else {
			System.out.println("The interest rate has to be between 0 and 100. It is set by default to 0.07.");
			interestRate = 0.07;
			this.interestRate = interestRate;
		}
		
	}

	public void calculateInvestmentOutput5Years (double investment, double interestRate) {
		for (int j = 0; j < 30; j += 5) {
			for (int i = 0; i < 5; i++) {
				investment = investment + (investment * interestRate);
			}
		System.out.printf("After %d years, you have: %.2f%n", j + 5, investment);
		}
		
	}
}
