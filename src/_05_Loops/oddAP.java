package _05_Loops;

import java.util.Scanner;

public class oddAP {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number : ");
            int n = sc.nextInt();

            // 1 3 5 7 9 11
            for(int i = 1; i <=2*n-1; i+=2){             // find last term using a+(n-1)*d
                System.out.print(i+ " ");
            }
        }
    }
}
