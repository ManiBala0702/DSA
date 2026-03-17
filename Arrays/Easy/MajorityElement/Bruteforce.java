// BruteForce
import java.util.*;
public class Bruteforce{
    public static int majorityelements(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    count++;
                }
            }
            if(count>nums.length/2){
                return nums[i];
            }
        }
        return -1;
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
        int ans = majorityelements(nums);
        System.out.print("Majority element is : "+ans);
    }
}