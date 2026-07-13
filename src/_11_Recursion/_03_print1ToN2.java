package _11_Recursion;

import java.util.Scanner;

public class _03_print1ToN2 {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        n = sc.nextInt();
        print(1);
    }
    public static void print(int x){
        if(x>n) return;
        System.out.println(x);
        print(x+1);
    }
}
