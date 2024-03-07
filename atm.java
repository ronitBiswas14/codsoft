import java.util.Scanner;

public class atm {
     public static void displayBalance(int balance) 
	{ 
		System.out.println("Current Balance : " + balance); 
		System.out.println(); 
	} 

	
	public static int amountWithdrawing(int balance, 
										int withdrawAmount) 
	{ 
		System.out.println("Withdrawn Operation:"); 
		System.out.println("Withdrawing Amount : "
						+ withdrawAmount); 
		if (balance >= withdrawAmount) { 
			balance = balance - withdrawAmount; 
			System.out.println( 
				"Please collect your money and collect the card"); 
			displayBalance(balance); 
		} 
		else { 
			System.out.println("Sorry! Insufficient Funds"); 
			System.out.println(); 
		} 
		return balance; 
	} 

	
	public static int amountDepositing(int balance, 
									int depositAmount) 
	{ 
		System.out.println("Deposit Operation:"); 
		System.out.println("Depositing Amount : "
						+ depositAmount); 
		balance = balance + depositAmount; 
		System.out.println( 
			"Your Money has been successfully deposited"); 
		displayBalance(balance); 
		return balance; 
	} 

	public static void main(String args[]) 
	{ 
		int balance ; 
		int withdrawAmount ; 
		int depositAmount ; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance : ");
        balance=sc.nextInt();
        System.out.println("Enter the amount to withdraw : ");
        withdrawAmount=sc.nextInt();
        System.out.println("enter the amount to deposit : " );
        depositAmount=sc.nextInt();
		
		displayBalance(balance); 
		
		balance 
			= amountWithdrawing(balance, withdrawAmount); 
		
		balance = amountDepositing(balance, depositAmount); 
	} 
}

    

