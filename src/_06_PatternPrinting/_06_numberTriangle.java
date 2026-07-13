package _06_PatternPrinting;

import java.util.Scanner;

public class _06_numberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}


//  i print karwaa diye toh
//    1
//    2 2
//    3 3 3
//    4 4 4 4
//
//j print karwane par
//        1
//        1 2
//        1 2 3
//        1 2 3 4