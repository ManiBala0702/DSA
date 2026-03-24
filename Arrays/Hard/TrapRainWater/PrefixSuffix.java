import java.util.*;
public class PrefixSuffix{
    public static int prefixsuffix(int[] height){
    int[] left = new int[height.length];
    int[] right = new int[height.length];
    int max = -1;
    for(int i=0;i<height.length;i++){
        if(height[i]>max){
            max = height[i];
        }
        left[i]=max;
    }
    max = -1;
    for(int i=height.length-1;i>=0;i--){
        if(height[i]>max){
            max = height[i];
        }
        right[i]=max;
    }
    int total = 0;
    for(int i=0;i<height.length;i++){
        total = total + Math.min(left[i],right[i]) - height[i];
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
        int result = prefixsuffix(height);
        System.out.print("Rain stored : "+result);
}
}