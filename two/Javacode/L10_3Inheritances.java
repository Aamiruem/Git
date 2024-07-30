// Package declaration
package Git.two.Javacode;

// Class Calc containing basic arithmetic operations
class Calc {
    // Method to add two integers
    public int add(int n1, int n2) {
        return n1 + n2;
    }
    
    // Method to subtract the second integer from the first
    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

// Class L10_3Inheritance extending Calc to add more arithmetic operations
public class L10_3Inheritance extends Calc {
    // Method to multiply two integers
    public int multi(int n1, int n2) {
        return n1 * n2;
    }
    
    // Method to divide the first integer by the second
    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

// Main class to test the inheritance and the methods
public class L10_3Inheritances {
    public static void main(String a[]) {
        // Creating an object of L10_3Inheritance to access all methods (inherited and newly defined)
//        Calc obj = new Calc(); // Would only allow access to add and sub methods
        L10_3Inheritance obj = new L10_3Inheritance(); // Allows access to add, sub, multi, and div methods
        
        int r1 = obj.add(4, 5); // Calls the add method from Calc class, result is 9
        int r2 = obj.sub(7, 3); // Calls the sub method from Calc class, result is 4
        int r3 = obj.multi(5, 3); // Calls the multi method from L10_3Inheritance class, result is 15
        int r4 = obj.div(15, 4); // Calls the div method from L10_3Inheritance class, result is 3
        
        // Printing the results of addition and subtraction
        System.out.println(r1 + " " + r2); // Output: 9 4
    }
}













// package Git.two.Javacode;

// class Calc
// {
// 	public int add(int n1, int n2)
// 	{
// 		return n1+n2;
// 	}
// 	public int sub(int n1, int n2)
// 	{
// 		return n1-n2;
// 	}
// }


// public class L10_3Inheritances
// {
// 	public static void main(String a[]) 
// 	{
// //		Calc obj=new Calc();
// 		L10_3Inheritance obj=new L10_3Inheritance();
// 		int r1=obj.add(4, 5);
// 		int r2=obj.sub(7,3);
// 		int r3=obj.multi(5,3);
// 		int r4=obj.div(15,4);
		
// 		System.out.println(r1+" "+r2);
		
// 	}
// }
