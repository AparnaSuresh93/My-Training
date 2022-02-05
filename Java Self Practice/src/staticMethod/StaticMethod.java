package staticMethod;
import java.util.Scanner;

public class StaticMethod {
	static String name,empName;
	static int age,sal;
	
	public static void display(String name,int age)
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		
	}
	private static void setDetails(String empName,int sal)
	{
		String eName=empName;
		int empsal=sal;
		getDetails(eName,empsal);
	}
	private static void getDetails(String empName,int sal)
	{
		System.out.println("Name of the Employee::"+empName);
		System.out.println("Salary of the Employee::"+sal);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=s.next();
		System.out.println("Enter the age:");
		int age=s.nextInt();
		display(name,age);
		setDetails("Aparna",28000);
		s.close();
		
		

	}

}
