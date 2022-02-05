package package1;
import java.util.Scanner;


public class FactorialRecrusion {
	int num;
	public void fact(int num)
	{
	int fact=num;
	for(int i=1;i<num;i++)
	{
		fact=fact*(num-i);
		
	}
	 System.out.println("Factorial of "+num+" is::"+fact);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactorialRecrusion obj=new FactorialRecrusion();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to find Factorial::");
		int num=s.nextInt();
		obj.fact(num);
		s.close();
		
		
		
	}

}
