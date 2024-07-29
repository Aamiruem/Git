package Git.two.Javacode;
// class Calculator
// {
// 	int num=5;
// 	public int add(int n1, int n2)
// 	{
// 		System.out.println(num);
// 		return n1+n2;
// 	}
// }

// public class L5_3StackAndHeap {
// 	public static void main(String[] args) {
// 		@SuppressWarnings("unused")
// 		int data=10;
// 		Calculator obj=new Calculator();
// 		Calculator obj1=new Calculator();
// 		int r1=obj.add(3,4);
// 		System.out.println(r1);
// 		obj.num=8;
// 		System.out.println(obj.num);
// 		System.out.println(obj1.num);
// 	}
// }
// Define a class named Calculator




// Create a new instance of the Calculator class
class Calculator {

    int num = 5; // Instance variable num initialized to 5

    // Method to add two integers and return their sum
    public int add(int n1, int n2) {
        System.out.println(num); // Print the value of the instance variable num
        return n1 + n2; // Return the sum of n1 and n2
    }
}

// Main class
public class L5_3StackAndHeap {

    public static void main(String[] args) {
        @SuppressWarnings("unused")
        int data = 10; // Declare and initialize a local variable data to 10, suppressing unused warning

        // Create a new instance of the Calculator class
        Calculator obj = new Calculator();

        // Create another instance of the Calculator class
        Calculator obj1 = new Calculator();

        // Call the add method on obj with arguments 3 and 4
        // The add method will print the value of num (which is 5) and return the sum (which is 7)
        int r1 = obj.add(3, 4);

        // Print the result of the add method
        System.out.println(r1); // Output: 7

        // Change the value of the instance variable num in obj to 8
        obj.num = 8;

        // Print the value of the instance variable num in obj
        System.out.println(obj.num); // Output: 8

        // Print the value of the instance variable num in obj1
        // The value of num in obj1 is still 5 because obj1 is a different instance of Calculator
        System.out.println(obj1.num); // Output: 5
    }
}
