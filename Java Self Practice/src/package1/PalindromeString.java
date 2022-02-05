package package1;
import java.util.Scanner;
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String to check::");
		String str=s.next();
		int l=str.length();
		String reverse="";
		for(int i=l-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
		s.close();

	}

}
