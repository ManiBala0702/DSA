import java.util.*;
public class LargestOddNumber {
    public static String largestOddNumber(String num) {
        for(int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            if(digit % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number string:");
        String num = sc.nextLine();
        String result = largestOddNumber(num);
        // it calss the function largestOddNumber and stores the returned value inside a variable named result
        System.out.println("Largest Odd Substring: " + result);
    }
}