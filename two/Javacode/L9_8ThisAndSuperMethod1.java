package Git.two.Javacode;

/**
// super()
class A
{
	public A() 
	{
		super();
		System.out.println("in A");
	}
	public A(int n)
	{
		super();
		System.out.println("in A int");
	}
}
class B extends A
{
	public B()
	{
//		super();
		super(5);
		System.out.println("in B");
	}
	public B(int n)
	{
//		super();   //call default constructor of super class
		super(n);
		System.out.println("in B int");
	}
}
public class Demo {
	public static void main(String[] args) 
	{
		
		B obj=new B();
//		B obj=new B(5);
	}
}
**/





//this() 
// Class A with two constructors
class A {
    // Default constructor of class A
    public A() {
        super(); // Calls the constructor of the superclass (Object class)
        System.out.println("in A"); // Prints "in A"
    }
    
    // Parameterized constructor of class A
    public A(int n) {
        super(); // Calls the constructor of the superclass (Object class)
        System.out.println("in A int"); // Prints "in A int"
    }
}

// Class B that extends class A
class B extends A {
    // Default constructor of class B
    public B() {
        super(); // Calls the default constructor of the superclass (A)
        System.out.println("in B"); // Prints "in B"
    }
    
    // Parameterized constructor of class B
    public B(int n) {
        this(); // Calls the default constructor of the same class (B)
        System.out.println("in B int"); // Prints "in B int"
    }
}

// Main class to test the constructors
public class L9_8ThisAndSuperMethod1 {
    public static void main(String[] args) {
        // Uncommenting the following line would create an instance of B using the default constructor
        // B obj = new B(); // Would print "in A", "in B"
        
        // Creates an instance of B using the parameterized constructor
        B obj = new B(5); // Prints "in A", "in B", "in B int"
    }
}
