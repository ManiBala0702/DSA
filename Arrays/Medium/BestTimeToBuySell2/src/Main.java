// Greedy method
import java.util.*;
public class Main{
    public static int besttimetobuyandsell(int[] nums){
        int profit = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                profit = profit + nums[i]-nums[i-1];
            }
        }
        return profit;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the array Elements : ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result = besttimetobuyandsell(nums);
        System.out.print("Profit : "+result);
    }
}