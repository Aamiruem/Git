package Git.two.Javacode;
//repeat this statement 4 times
//loop -while, do while, for

//100 - condition
// first of all for loop






// public class L3_1NestedForLoop {

//     public static void main(String[] args) {
//         //repeat this statement 4 times
//         //loop -while, do while, for

//         //100 - condition
//         // first of all for loop
//         for (int i = 1; i <= 4; i++) {

//             System.out.println("Hi");
//         }

//     }
// }







// public class L3_1NestedForLoop {

//     public static void main(String[] args) {

// 		int n = 0;
//         do{
//             System.out.println("Hi");
//             n++;
//         }
//         while(n<4);
//     }
// }









public class L3_1NestedForLoop {

    public static void main(String[] args) {
        // Repeat the statement 4 times using different types of loops

        // Using a while loop
        System.out.println("Using while loop:");
        int n = 0;
        while (n < 4) { // Loop until n is less than 4
            System.out.println("Hi");
            n++; // Increment n to eventually break the loop
        }

        // Using a do-while loop
        System.out.println("\nUsing do-while loop:");
        int m = 0;
        do {
            System.out.println("Hi");
            m++; // Increment m to eventually break the loop
        } while (m < 4); // Loop until m is less than 4

        // Using a for loop
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < 4; i++) { // Loop from 0 to 3
            System.out.println("Hi");
        }
    }
}
