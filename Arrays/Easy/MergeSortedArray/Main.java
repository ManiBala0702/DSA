import java.util.*;
public class Main{
    public static void merge(int[] nums1,int m, int[] nums2, int n){
        int[] ans = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
            ans[k++] = nums1[i++];
            }
            else{
                ans[k++]=nums2[j++];
            }
        }
        while(i<m){
            ans[k++]=nums1[i++];
        }
        while(j<n){
            ans[k++]=nums2[j++];
        }
        for(int x=0;x<m+n;x++){
            nums1[x]=ans[x];
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[] nums1 = new int[m+n];
        int[] nums2 = new int[n];
        for(int i=0;i<m;i++) {
            nums1[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            nums2[i] = sc.nextInt();
        }
        merge(nums1,m,nums2,n);
        System.out.println(Arrays.toString(nums1));
    }
}