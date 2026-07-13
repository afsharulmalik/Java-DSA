package _07_Methods;

import java.util.Scanner;

public class _05_combinationFunction {
    public static int fact(int a){
        int aFact = 1;
        for(int i =1; i<=a; i++){
            aFact *= i;
        }
        return aFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        int rFact = fact(r);
        int nFact = fact(n);
        int n_rFact = fact(n-r);
        int nCr = nFact/(rFact*n_rFact);
        System.out.println("The Combination of "+n+" and "+r+" is "+nCr);
    }
}
