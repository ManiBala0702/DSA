import java.util.*;
public class TwoPointers{
    public static int remove(int[] nums){
        if(nums.length<=2){
            return nums.length;
        }
        int k = 2;
        for(int i=2;i<nums.length;i++){
            if(nums[i]!=nums[k-2]){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No.of Array Elements : ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter The Array Elements : ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int length = remove(nums);
        System.out.print("Length : "+length);
    }
}