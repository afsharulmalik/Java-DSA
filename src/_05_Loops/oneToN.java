package _05_Loops;

import java.util.Scanner;

public class oneToN {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value : ");
            int n = sc.nextInt();
            for(int i =1; i<=n; i++){
                System.out.println(i);
            }
        }
    }
}
