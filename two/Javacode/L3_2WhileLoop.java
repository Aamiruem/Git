package Git.two.Javacode;
// public class L3_2WhileLoop {

// 	public static void main(String[] args) {
// 		int i=1;
// 		while(i<=4)
// 		{
// 			System.out.println("Hi"+ i);
// 			int j=1;
// 			while(j<=3) {
// 				System.out.println("Hello"+j);
// 				j++;
// 			}
// 			i++;
// 		}
// 		System.out.println("Bye"+i);
// 	}
// }










public class L3_2WhileLoop {

    public static void main(String[] args) {
        int i = 1;

        // Infinite while loop
        System.out.println("Using infinite while loop:");
        while (true) {
            System.out.println("Hi " + i);
            i++;
            // Break condition added to prevent an infinite loop
            if (i > 4) {
                break; // Exit the loop when i exceeds 4
            }
        }

        // Reset i for the next loop
        i = 1;

        // Controlled while loop
        System.out.println("\nUsing controlled while loop:");
        while (i <= 4) {
            System.out.println("Hi " + i);
            i++;
        }
        System.out.println("Bye " + i); // i will be 5 here
    }
}
