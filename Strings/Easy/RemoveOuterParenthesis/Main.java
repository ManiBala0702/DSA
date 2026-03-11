import java.util.*;

public class Main {

    public static String removeOuterParentheses(String s) {

        StringBuilder result = new StringBuilder();
        int depth = 0;

        for(char c : s.toCharArray()) {

            if(c == '(') {
                if(depth > 0) {
                    result.append(c);
                }
                depth++;
            }
            else {
                depth--;
                if(depth > 0) {
                    result.append(c);
                }
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();   // read string input

        System.out.println(removeOuterParentheses(s));
    }
}