package package1;
import java.util.Scanner;

public class PalindromeORNot {
	public static int reverse(int num)
	{
		int rev=0,d=0;
		int n=num;
		while(n>0)
		{
			d=n%10;
			rev=rev*10+d;
			n/=10;
		}
		return rev;
	}
	public static void check(int n,int rev)
	{
		if(n==rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
			System.out.println("Number is not Palindrome");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to check:");
		int num=s.nextInt();
		reverse(num);
		int rev=reverse(num);
		check(num,rev);
		s.close();
		

	}

}
