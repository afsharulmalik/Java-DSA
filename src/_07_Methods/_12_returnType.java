package _07_Methods;

import java.util.Scanner;

public class _12_returnType {
    public static int add(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.println(add(a,b));
    }
}
