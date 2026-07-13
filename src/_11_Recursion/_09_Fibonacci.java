package _11_Recursion;

import java.util.Scanner;

public class _09_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("The required output is : "+fibo(n));
    }
    public static int fibo(int n){
        if(n<=1) return n;
        else return fibo(n-1) + fibo(n-2);
    }
}


//       Time Complexity : O(2^n) 