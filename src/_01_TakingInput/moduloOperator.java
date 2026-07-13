package _01_TakingInput;

import java.util.Scanner;

public class moduloOperator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the dividend : ");
            int a = sc.nextInt();
            System.out.print("Enter the divisor : ");
            int b = sc.nextInt();
            int r = a % b;         // modulo operator
            System.out.println("The remainder when " + a + " is divided by " + b + " is : " + r);
        }
    }
}
