import java.util.*;
public class Main{
    public static int remove(int[] nums){
        int[] temp = new int[nums.length];
        int k =0;
        int count = 1;
        temp[k++]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }
            else{
                count=1;
            }
            if(count<=2){
                temp[k++]=nums[i];
            }
        }
        for(int i=0;i<k;i++){
            nums[i]=temp[i];
        }
        return k;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Array Elements : ");
        int n = sc.nextInt();
        System.out.print("enter the Array Elements : ");
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int length = remove(nums);
        for(int i=0;i<length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println("Length : "+length);
    }
}