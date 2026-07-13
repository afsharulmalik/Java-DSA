package _07_Methods;

import java.util.Scanner;

public class _06_permutationFunction {
    public static int fact(int a){
//        int aFact = 1;
//        for(int i =1; i<=a; i++){
//            aFact *= i;
//        }
//        return aFact;
        return (a<=1) ? 1 : a*fact(a-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        System.out.print("Enter r : ");
        int r = sc.nextInt();
        int nFact = fact(n);
        int n_rFact = fact(n-r);
        int nPr = nFact/n_rFact;
        System.out.println("The Combination of "+n+" and "+r+" is "+nPr);
    }
}
