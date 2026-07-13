package _06_PatternPrinting;

import java.util.Scanner;

public class _20_alphabetTriangleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){ // spaces wala loop
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){  // printing wala loop
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
