import java.util.*;
public class Main{
    public static int removeelements(int[] nums, int val){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Elements : ");
        int n = sc.nextInt();
        System.out.print("Enter Array Elements : ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter The Value to Remove: ");
        int val = sc.nextInt();
        int length = removeelements(nums, val);
        System.out.println("length : " +length);
    }
}