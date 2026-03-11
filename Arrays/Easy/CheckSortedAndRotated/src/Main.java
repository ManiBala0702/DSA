import java.util.*;
public class Main {
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            if(nums[i] > nums[i+1]){
                count++;
            }
        }
        if(nums[n-1] > nums[0]){
            count++;
        }
        return count <= 1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        System.out.println(check(nums));
    }
}