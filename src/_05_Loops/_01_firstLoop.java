package _05_Loops;

import java.util.Scanner;
public class _01_firstLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of n : ");
            int n = sc.nextInt();
            for(int i = 0; i<=n-1; i++){
                System.out.println("Hello Bc!");
            }
        }
    }
}
