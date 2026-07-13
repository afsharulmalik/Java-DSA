package _05_Loops;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();
            int i = 1;
            while(i<=n){
                System.out.print(i+ " ");
                i++;
            }
        }
    }
}
