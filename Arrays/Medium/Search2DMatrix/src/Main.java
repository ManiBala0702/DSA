import java.util.*;
public class Main{
    public static boolean searchmatrix(int[][] matrix, int target){
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(matrix[i][j]==target) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int target = sc.nextInt();
        boolean result = searchmatrix(matrix, target);
        if(result){
            System.out.println("True");
        }else{
            System.out.print("false");
        }
    }
}