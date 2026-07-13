package _06_PatternPrinting;

import java.util.Scanner;

public class _04_squareNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        for(int i =1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
//        j print karenge toh
//                1 2 3 4
//                1 2 3 4
//                1 2 3 4
//                1 2 3 4
//        i print karenge toh
//                1 1 1 1
//                2 2 2 2
//                3 3 3 3
//                4 4 4 4
    }
}
