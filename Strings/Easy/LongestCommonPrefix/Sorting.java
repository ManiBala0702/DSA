import java.util.*;
public class Sorting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of String : ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] strs = new String[n];
        System.out.println("Enter the Strings : ");
        for(int i=0;i<n;i++){
            strs[i]=sc.next();
        }
        String result = longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: "+result);
    }
    public static String longestCommonPrefix(String[] strs){
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length-1];
        int i = 0;
        while(i<str1.length()){
            if(str1.charAt(i)==str2.charAt(i)){
                i++;
            }else{
                break;
            }
        }
        return i==0?"":str1.substring(0,i);
    }
}