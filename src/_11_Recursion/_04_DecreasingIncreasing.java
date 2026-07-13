package _11_Recursion;

import java.util.Scanner;

public class _04_DecreasingIncreasing {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0) return;
        System.out.print(n+" ");
        print(n-1);
        if(n!=1) System.out.print(n+" ");  // if condition is for printing 1 only a single time
    }
}
