package Git.two.Javacode;
// package javacode;

public class L13Ternary {

    public static void main(String[] args) {
        int n = 4;
        int result = 0;

        // Using if-else statement to set result based on whether n is even or odd
        if (n % 2 == 0) // Check if n is even
            result = 10; // If n is even, set result to 10
        else
            result = 20; // If n is odd, set result to 20

        System.out.println(result); // Print the result (for n=4, this will print 10)

        int n1 = 5;
        int result1 = 0;

        // Using ternary operator to achieve the same logic as above
        result1 = n1 % 2 == 0 ? 10 : 20; // Check if n1 is even, if true, set result1 to 10, else set to 20

        System.out.println(result1); // Print the result (for n1=5, this will print 20)
    }
}
