package Git.two.Javacode;
class Human {
	// int age;
	// private int age=11;
	private int age;
	// String name;
	// private String name="Kamran";
	private String name;

	public int getAge() {
		return age;
	}

	public void SetAge(int a) {
		age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}
}

public class L9_1Encapsulation {
	public static void main(String[] args) throws ClassNotFoundException {
		Human obj = new Human();
		obj.SetAge(30);
		obj.setName("Reddy");
		// obj.age=11;
		// obj.name="Hussain";

		System.out.println(obj.getName() + " : " + obj.getAge());

	}
}
