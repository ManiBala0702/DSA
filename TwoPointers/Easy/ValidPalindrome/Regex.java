import java.util.*;
public class Regex{
    public static boolean isPalindrome(String s){
        String withoutspace = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String rev = new StringBuilder(withoutspace).reverse().toString();
        return withoutspace.equals(rev);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        if(isPalindrome(s)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}