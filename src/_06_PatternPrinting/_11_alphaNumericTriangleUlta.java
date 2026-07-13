package _06_PatternPrinting;

import java.util.Scanner;

public class _11_alphaNumericTriangleUlta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n+1-i; j++) {
                if(i%2!=0){
                    System.out.print(j+" ");
                } else {
                    System.out.print((char)(j+64)+" ");
                }
            }
            System.out.println();
        }
    }
}
