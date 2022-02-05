package practice;

public class Typecasting {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Typecasting oo=new Typecasting();
		System.out.println(oo instanceof Typecasting);
		Typecasting ob=null;
		System.out.println(ob instanceof Typecasting);
		int a=9;
		int q=-19;
		boolean o=false;
		boolean z=true;
		float b=a;
		float n=10.9f;
		int g=(int)n;
		int x=130;
		byte y=(byte)x;
		byte t=10;
		byte s=10;
		//byte u=s+t;   //Compile Time Error: because a+b=20 will be int
		byte c=(byte)(t+s);
		System.out.println(b);
		System.out.println(a);
		System.out.println(g);
		System.out.println(y);
		System.out.println(c);
		System.out.println(~a);
		System.out.println(~q);
		System.out.println(!z);
		System.out.println(!o);
		
}

}
