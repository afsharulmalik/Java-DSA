package _11_Recursion;

import java.util.Scanner;

public class _05_Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int result = fact(n);   // capture return value
        System.out.println("Factorial = " + result);
    }
    public static int fact(int n) {
        if (n<=0) return 1;
        return n * fact(n - 1);   // CORRECT RECURSION
    }
}
