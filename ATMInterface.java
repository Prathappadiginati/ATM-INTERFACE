package Task3;
import java.util.Scanner;

public class ATMInterface {
	

	    private double balance;

	    public ATMInterface(double initialBalance) {
	        this.balance = initialBalance;
	    }

	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: ₹" + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    public void withdraw(double amount) {
	        if (amount <= 0) {
	            System.out.println("Invalid withdrawal amount.");
	        } else if (amount > balance) {
	            System.out.println("Insufficient balance.");
	        } else {
	            balance -= amount;
	            System.out.println("Withdrawn: ₹" + amount);
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
	}

	



