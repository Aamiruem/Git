package Git.two.Javacode;

// import java.util.Scanner;
// public class L14SwitchStatement {
// 	public static void main(String[] args) {
// 		System.err.println("Enter number for week name: = ");
// 		Scanner sc = new Scanner(System.in);
// 		int day = sc.nextInt();
// 		switch(day) {
// 		case 1:
// 			System.out.println("Monday");
// 			break;
// 		case 2:
// 			System.out.println("Tuesday");
// 			break;
// 		case 3:
// 		System.out.println("Wednesday");
// 			break;
// 		case 4:
// 		System.out.println("Thursday");
// 			break;
// 		case 5:
// 		System.out.println("Friday");
// 			break;
// 		case 6:
// 		System.out.println("Saturday");
// 			break;
// 		case 7:
// 		System.out.println("Sunday");
// 			break;
// 		default:
// 			System.out.println("Enter a valid number");			
// 		}
// 	}
// }
// import java.util.Scanner;
// public class L14SwitchStatement {
// 	public static void main(String[] args) {
// 		System.err.println("Enter number for week name: = ");
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		if(n==1)
// 			System.out.println("Monday");
// 		else if(n==2)
// 			System.out.println("Tuesday");
// 		else if(n==3)
// 		System.out.println("Wednesday");
// 		else if(n==4)
// 		System.out.println("Thursday");
// 		else if(n==5)
// 		System.out.println("Friday");
// 		else if(n==6)
// 		System.out.println("Saturday");
// 		else
// 		System.out.println("Sunday");
// 	}
// }






import java.util.Scanner;

public class L14SwitchStatement {

    public static void main(String[] args) {
        System.err.println("Enter number for week name: = ");
        try (Scanner sc = new Scanner(System.in)) {
            int month = sc.nextInt();

            switch (month) {
                case 1:
                    System.out.println("january");
                    break;

                case 2:
                    System.out.println("february");
                    break;

                case 3:
                    System.out.println("march");
                    break;

                case 4:
                    System.out.println("april");
                    break;

                case 5:
                    System.out.println("may");
                    break;

                case 6:
                    System.out.println("june");
                    break;

                case 7:
                    System.out.println("july 31");
                    break;

                case 8:
                    System.out.println("august");
                    break;

                case 9:
                    System.out.println("september");
                    break;

                case 10:
                    System.out.println("october");
                    break;

                case 11:
                    System.out.println("november");
                    break;

                case 12:
                    System.out.println("december");
                    break;

                default:
                    System.out.println("Enter a valid number");

            }
        }
    }
}
