//Moore's Voting Algorithm
import java.util.*;
public class Main{
    public static int majorityelement(int[] nums){
        int count = 0;
        int insertinto = 0;
        for(int num : nums){
            if(count==0){
                insertinto = num;
            }
            if(insertinto==num){
                count++;
            }else{
                count--;
            }
        }
        return insertinto;
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
        int ans = majorityelement(nums);
        System.out.print("Majority element is : "+ans);
    }
}