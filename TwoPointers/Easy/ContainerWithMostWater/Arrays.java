import java.util.*;
public class Arrays{
    public static int maxArea(int[] height){
        int n = height.length;
        int maxArea = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int h = Math.min(height[i],height[j]);
                int width = j - i;
                int area = h * width;
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n = sc.nextInt();
        int[] height = new int[n];
        System.out.print("Enter the heights : ");
        for(int i=0;i<n;i++){
            height[i]=sc.nextInt();
        }
        int result = maxArea(height);
        System.out.println("Result: "+result);
    }
}