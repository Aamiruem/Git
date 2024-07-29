package Git.two.Javacode;
// class Calculator
// {
// 	public int add(int n1, int n2, int n3)
// 	{
// 		return n1+n2+n3;
// 	}
// 	public int add(int n1, int n2)
// 	{
// 		return n1+n2;
// 	}
// 	public double add(double n1, int n2)
// 	{
// 		return n1+n2;
// 	}
// }


// public class L5_2MethodOverloading {
// 	public static void main(String[] args) {
// 		Calculator obj=new Calculator();
// 		int r=obj.add(3,4,5);
// 		System.out.println(r);

// 		int r1=obj.add(3,4);
// 		System.out.println(r1);
// 	}
// }

import java.util.Scanner;

class Calculator
{
	public int add(int n1, int n2, int n3)
	{
		return n1+n2+n3;
	}
	public int add(int n1, int n2)
	{
		return n1+n2;
	}
	public double add(double n1, int n2)
	{
		return n1+n2;
	}
}


public class L5_2MethodOverloading {
	public static void main(String[] args) {
		Calculator obj=new Calculator();
            try (Scanner sc = new Scanner(System.in)) {
                System.out.println("Enter first numbers");
                int n1=sc.nextInt();
                System.out.println("Enter second numbers");
                int n2=sc.nextInt();
                System.out.println("Enter third numbers");
                int n3=sc.nextInt();
                int r=obj.add(n1, n2, n3);
                System.out.println("sum of three numbers is: = " + r);
                
                System.err.println("\n");
                
                System.out.println("Enter first numbers");
                int m1=sc.nextInt();
                System.out.println("Enter second numbers");
                int m2=sc.nextInt();
                int r1=obj.add(m1, m2);
                System.out.println("sum of two numbers is: = " + r1);
            }
	}
}
