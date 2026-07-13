package _05_Loops;

import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value : ");
            int n = sc.nextInt();

            // 1 2 4 8 16 32 64 128
            int a = 1;
            int d = 2;
            for(int i = 1;i<=n;i++){
                System.out.print(a+ " ");
                a *= d;
            }
        }
    }
}
