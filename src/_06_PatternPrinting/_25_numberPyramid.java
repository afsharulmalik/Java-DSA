package _06_PatternPrinting;

import java.util.Scanner;

public class _25_numberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){  // spaces wala loop
                System.out.print("  ");
            }
            for(int j=1; j<=2*i-1; j++){  // printing wala loop
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
