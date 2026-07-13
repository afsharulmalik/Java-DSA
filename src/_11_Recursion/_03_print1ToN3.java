package _11_Recursion;

import java.util.Scanner;

public class _03_print1ToN3 {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();
        print(n);
    }
    public static void print(int n){
        if(n==0) return;
        print(n-1);
        System.out.println(n);
    }
}
