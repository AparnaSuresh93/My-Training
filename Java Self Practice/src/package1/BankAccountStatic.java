package package1;
import java.util.Scanner;

public class BankAccountStatic 
{
	static int currentBalance=1000;
	static int depositAmount;
	static int withdrawAmount;
	public static void withDraw(int withdrawAmount)
	{
		if(currentBalance>=withdrawAmount)
		{
			System.out.println("Amount Withdrawed");
		currentBalance=currentBalance-withdrawAmount;
		System.out.println("Balance Amount After withdrawal ::"+currentBalance);
		}
		else
			System.out.println("Insufficient Balance");
	}
	public static void deposit(int depositAmount)
	{
		currentBalance=currentBalance+depositAmount;
		System.out.println("Balance Amount After Deposit::"+currentBalance);
	}
	public static void balanceCheck()
	{
		System.out.println("Current Account Balance::"+currentBalance);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in); 
		System.out.println("Enter the Option:: 1) Deposit   2) Withdraw   3)Account Balance 4)Exit");
		int n=s.nextInt();
		switch(n)
		{
		case 1:
			{
				System.out.println("Enter the Amount to Deposit:");
		       int depositAmount=s.nextInt();
		       deposit(depositAmount);
		    
			}
		case 2:
		{
			System.out.println("Enter the Amount to Withdraw:");
	       int withdrawAmount=s.nextInt();
	       withDraw(withdrawAmount);
	       
		}
		case 3:
		{
			System.out.println("Current Account Balance:"+currentBalance);
			
		}
		case 4:break;
		}
		s.close();
	}
}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
					
				
