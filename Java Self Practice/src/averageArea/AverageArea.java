package averageArea;
import java.util.Scanner;
public class AverageArea {
	static float pi=3.14f;
	static Scanner s=new Scanner(System.in);
	public static void average(int a,int b,int c)
	{
		float avgInt=(a+b+c)/3;
		System.out.println("Average of Three Integer Numbers:"+avgInt);
	}
	public static void average(float a,float b,float c)
	{
		float avgFloat=(a+b+c)/3;
		System.out.println("Average of Three Float Numbers:"+avgFloat);
	}
	public static void area(float r)
	{
		float areaCir=pi*r*r;
		System.out.println("Area of the Circle::"+areaCir+" sq.units");
	}
	public static void area(int l,int br)
	{
		int areaRect=l*br;
		System.out.println("Area of the rectangle::"+areaRect+" sq.units");
	}
	public static void area(int side)
	{
		int areaSq=side*side;
		System.out.println("Area of the Square::"+areaSq+" sq.units");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculate Average of Three Integer Numbers");
		System.out.println("Enter the first integer number::");
		int a=s.nextInt();
		System.out.println("Enter the Second integer number::");
		int b=s.nextInt();
		System.out.println("Enter the Third integer number::");
		int c=s.nextInt();
		average(a,b,c);
		System.out.println("Calculate Average of Three Float Numbers");
		System.out.println("Enter the first Float number::");
		float x=s.nextFloat();
		System.out.println("Enter the Second Float number::");
		float y=s.nextFloat();
		System.out.println("Enter the Third Float number::");
		float z=s.nextFloat();
		average(x,y,z);
		System.out.println("Enter the radius of the Circle:");
		float r=s.nextInt();
		area(r);
		System.out.println("Enter the length of the Rectangle:");
		int l=s.nextInt();
		System.out.println("Enter the breadth of the Rectangle:");
		int br=s.nextInt();
		area(l,br);
		System.out.println("Enter the side of the Square:");
		int side=s.nextInt();
		area(side);
		


	}

}
