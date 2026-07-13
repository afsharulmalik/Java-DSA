package _01_TakingInput;

import java.util.Scanner;

public class sumOf2Num {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the 1st num : ");
            int a = sc.nextInt();
            System.out.print("Enter the 2nd num : ");
            int b = sc.nextInt();
            int sum = a + b;
            System.out.println("The sum of given numbers are " + sum);
        }

    }
}
