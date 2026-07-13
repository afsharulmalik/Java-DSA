package _05_Loops;

import java.util.Scanner;
import java.math.BigInteger;  // this library will be used to make the factorial of digits greater than 20

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        long fact = 1;
        for(int i = 1; i<=n; i++){
            fact *= i;
        }
        System.out.println("The factorial of the given number is "+fact);
    }
}
