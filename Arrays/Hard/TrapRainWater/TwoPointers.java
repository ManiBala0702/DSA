import java.util.*;
public class TwoPointers{
    public static int twopointers(int[] height){
        int left = 0;
        int right = height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int total = 0;
        while(left<=right){
            if(leftMax < rightMax){
                if(height[left]>=leftMax){
                    leftMax = height[left];
                }
                else{
                    total += leftMax - height[left];
                }
                left++;}
                else{
                    if(height[right]>=rightMax){
                        rightMax = height[right];
                    }
                    else{
                        total += rightMax - height[right];
                    }
                    right--;
                }
        }
        return total;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.print("Enter the array elements : ");
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        int result = twopointers(height);
        System.out.print("Rain stored : "+result);
    }
}