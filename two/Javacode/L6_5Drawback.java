package Git.two.Javacode;

public class L6_5Drawback {
	public static void main(String[] args) {
        int nums[] = new int[4];

        nums[0] = 5;
        nums[1] = 6;
        nums[2] = 7;
        nums[3] = 8;

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}

// Drawbacks:-
// - The memory allocation is contiguous.
// - The size of an array is fixed. Array size cannot be expand.
// - Searching takes time.
// - Array can store values of only same type. It can store homogeneous type value only.
