package _03_IfElse;

import java.util.Scanner;

public class _02_divisibleBy5 {
    public static void main(String[] args) {
        // Try-with-resources to manage Scanner
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any number: ");
            int n = sc.nextInt();
            if (n % 5 == 0) {
                System.out.println("Given number is divisible by 5");
            } else {
                System.out.println("Given number is not divisible by 5");
            }
        } // Scanner is automatically closed here
    }
}
