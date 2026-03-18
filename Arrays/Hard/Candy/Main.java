import java.util.*;
public class Main{
    public static int candy(int[] nums){
        if(nums == null || nums.length==0){
            return 0;}
        int[] candies = new int[nums.length];
        Arrays.fill(candies,1);
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                candies[i] = candies[i-1]+1;
            }
        }
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]>nums[i+1]){
                candies[i] = Math.max(candies[i],candies[i+1]+1);
            }
        }
        int total = 0;
        for(int c : candies){
            total = total + c;
        }
        return total;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
        int n = sc.nextInt();
        System.out.print("Enter the Array Elements : ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result = candy(nums);
        System.out.print("Total Candies: "+result);
    }
}