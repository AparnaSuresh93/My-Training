package Discount;

import java.util.Scanner;

public class DiscountArray {
	static Scanner s=new Scanner(System.in);
	static int discount=20;
	static int total=0;
	static float finalAmt;
	public static void totalPrice(int price1,int price2,int price3)
	{
	 total=price1+price2+price3;
		
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
		System.out.println("Enter the Price of item 1:");	
		int price1=s.nextInt();
		System.out.println("Enter the Price of item 2:");	
		int price2=s.nextInt();
		System.out.println("Enter the Price of item 3:");	
		int price3=s.nextInt();
		totalPrice(price1,price2,price3);
		System.out.println("Total Amount Purchased:"+total);
		float finalAmt=calcDiscount();
		System.out.println("Final Amount to be paid after discount::"+finalAmt);
		

	}

	

	

}
