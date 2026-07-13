package _11_Recursion;

import java.util.Scanner;

public class _06_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.print("The reverse of the given number is "+rev(n,0));
    }
    public static int rev(int n, int r){
        if(n==0) return r;
        else return rev(n/10, r*10+(n%10));
    }
}
