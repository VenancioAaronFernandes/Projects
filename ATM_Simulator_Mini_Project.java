import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//ATM simulator
		
		System.out.println("Welcome to Venancio Bank");
		System.out.println("Menu:");
		int balance = 10000;
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Check Balance");
		System.out.println("2:Withdraw money");
		System.out.println("3:Deposit money:");
		System.out.println("4:Exit");
		int choice = sc.nextInt();
		switch (choice){
		    case 1:{
		        System.out.println("Bank Balance:₹"+balance);
		        break;
		    }
		    case 2:{
		        System.out.println("Enter withdrawl amount:");
		        int wAmount = sc.nextInt();
		        if (wAmount>balance){
		            System.out.println("Insufficient balance for transaction!");
		            break;
		        }
		        else{
		            System.out.println("Transaction Completed Successfully!");
		            System.out.println("Cash withdrawn:₹"+wAmount);
		            balance = balance-wAmount;
		            System.out.println("Remaining balance:₹"+balance);
		            break;
		        }
		    }
		    case 3:{
		        System.out.println("Enter deposit amount:");
		        int deposit = sc.nextInt();
		        balance = balance + deposit;
		        System.out.println("Amount Deposited Successfully");
		        System.out.println("New balance:₹"+balance);
		        break;
		        }
		    default:
		        System.out.println("Thank you for using!");
		}
	}
}