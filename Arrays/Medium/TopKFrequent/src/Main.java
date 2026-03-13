import java.util.*;

public class TopKFrequent {

    public static int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Step 2: Max Heap based on frequency
        PriorityQueue<Integer> pq = new PriorityQueue<>(
                (a, b) -> map.get(b) - map.get(a)
        );

        pq.addAll(map.keySet());

        // Step 3: Extract top k elements
        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = pq.poll();
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter k:");
        int k = sc.nextInt();

        int[] ans = topKFrequent(nums, k);

        System.out.println("Top " + k + " frequent elements:");

        for (int num : ans) {
            System.out.print(num + " ");
        }
    }
}