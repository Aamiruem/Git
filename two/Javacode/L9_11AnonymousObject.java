package Git.two.Javacode;

class A
{
	public A()
	{
		System.out.println("object created");
	}
	public void show()
	{
		System.out.println("in A show");
	}
}


public class L9_11AnonymousObject
{
	public static void main(String a[]) 
	{
		@SuppressWarnings("unused")
		int marks;
		marks=99;
		
		new A();   //anonymous object
		new A().show();
		
//		A obj=new A();
		A obj;
		obj=new A();
		
		obj.show();
	}
}
