import java.util.*;
public class Main{
    public static int romantoint(String s){
        HashMap<Character, Integer> Map = new HashMap<>();
        Map.put('I',1);
        Map.put('V',5);
        Map.put('X',10);
        Map.put('L',50);
        Map.put('C',100);
        Map.put('D',500);
        Map.put('M',1000);
        int result = Map.get(s.charAt(s.length()-1));
        for(int i=s.length()-2;i>=0;i--){
            if(Map.get(s.charAt(i))<Map.get(s.charAt(i+1))){
                result = result - Map.get(s.charAt(i));
            }
            else{
                result = result + Map.get(s.charAt(i));
            }
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Roman : ");
        String s = sc.nextLine();
        int res = romantoint(s);
        System.out.print("Integer : "+res);
    }
}