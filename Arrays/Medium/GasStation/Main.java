import java.util.*;
public class Main{
    public static int gasstation(int[] gas, int[] cost){
        int totalCost = 0, totalGas = 0, tank = 0, start = 0;
        for(int i=0;i<gas.length;i++){
            totalGas += gas[i];
            totalCost += cost[i];

            tank += gas[i] - cost[i];
            if(tank<0){
                start = i+1;
                tank = 0;
            }
        }
        return totalGas>= totalCost ? start : -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the gas and cost array : ");
        int n = sc.nextInt();
        int[] gas = new int[n];
        System.out.print("Enter gas array : ");
        for(int i=0;i<n;i++){
            gas[i]=sc.nextInt();
        }
        int[] cost = new int[n];
        System.out.print("Enter cost array : ");
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }
        int result = gasstation(gas,cost);
        System.out.print("Result: "+result);
    }
}