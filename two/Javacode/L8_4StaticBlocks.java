package Git.two.Javacode;
class Mobile{
	String brand;
	int price;
	String network;
	static String name;
	
	static {
		name="Phone";
		System.out.println("in static block");
	}
	
	public Mobile() {
		brand="";
		price=200;
//		name="Phone";
		System.out.println("in constructor");
	}
	
	public void show() {
		System.out.println(brand+" : "+price+" : "+name);
	}
	
	
}

public class L8_4StaticBlocks {
	public static void main(String[] args) throws ClassNotFoundException
	{
		
		Class.forName("Mobile");
		
		Mobile obj1=new Mobile();
		obj1.brand="Apple";
		obj1.price=1500;
		Mobile.name="SmartPhone";
		
		Mobile obj2=new Mobile();
		obj2.brand="Samsung";
		obj2.price=1700;
		Mobile.name="SmartPhone";
		
		obj1.show();
		obj2.show();

	
	}
}
