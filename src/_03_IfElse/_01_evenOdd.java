package _03_IfElse;

import java.util.Scanner;

public class _01_evenOdd {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter any number : ");
            int a = sc.nextInt();
            if (a % 2 == 0) {
                System.out.println("Given number is Even");
            } else {
                System.out.println("Given number is Odd");
            }
        }
    }
}
