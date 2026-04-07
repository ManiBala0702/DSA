import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        int n = sc.nextInt();

        int[] nums = new int[n];

        // Input array
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = reversePairs(nums);

        System.out.println(result);

        sc.close();
    }

    public static int reversePairs(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Check all pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                // Important: use long to avoid overflow
                if ((long) nums[i] > 2L * nums[j]) {
                    count++;
                }
            }
        }

        return count;
    }
}