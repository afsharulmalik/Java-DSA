package _07_Methods;

import java.util.Scanner;

public class _02_sum {
    // Method
    public static void add(int a, int b, int c){
        System.out.println("Sum is "+(a+b+c));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("Enter c : ");
        int c = sc.nextInt();
        add(a,b,c);
    }
}
