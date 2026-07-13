package _11_Recursion;

import java.util.Scanner;

public class _10_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int lcm = (a*b)/gcd(a, b);  // iss concept se lcm niklega
        System.out.print("The LCM of given number is "+lcm);
    }
    public static int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b, a%b);
    }
}
