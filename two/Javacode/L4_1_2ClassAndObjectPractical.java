package Git.two.Javacode;
public class L4_1_2ClassAndObjectPractical{
	public static void main(String[] args) 
	{
		int n1=4;
		int n2=5;
		Calculator calc= new Calculator();
		int result=calc.add(n1,n2);
		//calc.add();
		//int result=calc.add();
		//int result=num1+num2;
		System.out.println(result);
		
	}
}

class Calculator{
	public int add(int n1, int n2)
	{
		// int a;
		// System.out.println("in add");
		// return 0;

		// int r=num1+num2;
		// return r;

		int r=n1+n2;
		return r;
	}
}

// Object Oriented programming
// Object - Properties and Beahaviors

//Class
