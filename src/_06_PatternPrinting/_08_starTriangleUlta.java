package _06_PatternPrinting;

import java.util.Scanner;
// star Triangle Horizontally flip

public class _08_starTriangleUlta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            for (int j=1; j<=n+1-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}



//   Concept
//i+j = n+1
//column aur row ko add krne par woh n+1 aa rha hai and isme yhi concept lagega