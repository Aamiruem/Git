package Git.two.Javacode;
public class L3_4ForLoop {

    public static void main(String[] args) {
        // First for loop: prints "Hi0", "Hi1", "Hi2", "Hi3", "Hi4"
        for (int i = 0; i <= 4; i++) {
            System.out.println("Hi" + i); // Prints "Hi" followed by the current value of i
        }

        // Second for loop: prints "Day1" to "Day7" with nested loop for times
        for (int i = 1; i <= 7; i++) {
            System.out.println("Day" + i); // Prints "Day" followed by the current value of i
            for (int j = 1; j <= 9; j++) {
                System.out.println(" " + (j + 8) + "-" + (j + 9)); // Prints time slots in the format " 9-10", "10-11", etc.
            }
        }

        // Third for loop: prints "DAY1" to "DAY5"
        int i = 1; // Initialize the variable i to 1
        for (; i <= 5;) { // A for loop without initialization and increment parts
            System.out.println("DAY" + i); // Prints "DAY" followed by the current value of i
            i++; // Increments i by 1 in each iteration
        }
    }
}
