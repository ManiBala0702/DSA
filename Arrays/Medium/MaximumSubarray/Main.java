import java.util.*;
public class Main{
    public static int maximumsubarray(int[] nums){
        int sum = 0;
        int max = nums[0];
        for(int i=0;i<nums.length;i++){
            sum = sum + nums[i];
            if(sum<0){
                sum = 0;
            }
            if(sum>max){
                max = sum;
            }
        }
        return max;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result = maximumsubarray(nums);
        System.out.print("Maximun subarray : "+result);
    }
}