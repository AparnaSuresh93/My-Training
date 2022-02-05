package package1;

public class Child extends StaticMethodIheritance{
	public static void disChild()
	{
		System.out.println("This is Static method in child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		disParent();
		disChild();

	}

}
