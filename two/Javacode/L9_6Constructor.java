package Git.two.Javacode;
class Human
{
	private int age;
	private String name;
	
	public Human()
	{
		age=12;
		name="KAMRAN";
		//System.out.println("in constructor");
	}
	public int getAge(){
		return age;
	}
	public void SetAge(int age)
	{
		this.age=age;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

public class L9_6Constructor {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		Human obj1=new Human();
		System.out.println(obj.getName()+" : "+obj.getAge());
		System.out.println(obj1.getName()+" : "+obj1.getAge());
		
		obj.SetAge(30);
		obj.setName("Reddy");
		

		//System.out.println(obj.getName()+" : "+obj.getAge());
	}
}
