package Discount;
import java.util.Scanner;

public class Discount {
	static Scanner s=new Scanner(System.in);
	static int discount=20;
	static int total=0;
	static float finalAmt;
	public static void totalPrice()
	{
		System.out.println("Enter the number of Items need to purchase::");
		int n=s.nextInt();
		System.out.println("Enter the Price of items:");	
		for(int i=1;i<=n;i++)
		{
		  System.out.println("Price of item "+i);
		  int price=s.nextInt();
		  total=total+price;
		}
		System.out.println("Total Amount Purchased:"+total);
	}
	public static float calcDiscount()
	{
		if(total>5000)
		{
			System.out.println("Discount is applicable");
			 finalAmt=total-total*discount/100;
		}
		else
		{
			System.out.println("Discount is not applicable");
			finalAmt=total;
		}
		return finalAmt;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		totalPrice();
		float finalAmt=calcDiscount();
		System.out.println("Final Amount to be paid after discount::"+finalAmt);
		

	}

}
