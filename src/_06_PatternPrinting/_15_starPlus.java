package _06_PatternPrinting;

import java.util.Scanner;
// for n is odd
public class _15_starPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int m = n/2 + 1;
        for(int i =1; i<=n; i++){
            for(int j =1; j<=n; j++){
                if(i==m || j==m){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
