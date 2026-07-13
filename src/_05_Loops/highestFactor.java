package _05_Loops;

import java.util.Scanner;

public class highestFactor {
    // Method to calculate HCF
    public static int findHCF(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b; // remainder
            a = temp;
        }
        return a;
    }
    // Yahaa se main program hai !!!
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Calculating HCF using Euclidean Algorithm
        int hcf = findHCF(num1, num2);

        // Display result
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);

        sc.close();
    }


}
