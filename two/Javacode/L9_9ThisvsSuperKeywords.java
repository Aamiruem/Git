// Package declaration
package Git.two.Javacode;

// Class A that extends Object (implicitly done, shown here for clarity)
class A extends Object {
    int num = 1; // Member variable of class A
}

// Class B that extends class A
class B extends A {
    int num = 2; // Member variable of class B, shadows the num variable of class A
	
    
    // Method to get a value
    public int getValue() {
        int num = 3; // Local variable within the method getValue, shadows the num variable of class B
//        return this.num; // Would return the num variable of class B (2)
        return super.num; // Returns the num variable of class A (1)
    }
}

// Main class to test the behavior of 'this' and 'super' keywords
public class L9_9ThisvsSuperKeywords {
    public static void main(String a[]) {
        B obj = new B(); // Creates an instance of class B
       System.out.println(obj.num); // Would print the num variable of class B (2)
        System.out.println(obj.getValue()); // Calls the getValue method of class B and prints the returned value
		System.out.println(obj.num); // Would print the num variable of class B (2)
    }
}
