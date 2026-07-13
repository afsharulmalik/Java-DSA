package _11_Recursion;

import java.util.Scanner;

public class _08_GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        System.out.print("The GCD of given number is "+gcd(a,b));
    }
    public static int gcd(int a, int b){
        if(b == 0) return a;
        else return gcd(b, a%b);
    }
}


// TC : O(log(min(a,b)))