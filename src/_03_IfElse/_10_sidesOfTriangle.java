package _03_IfElse;

import java.util.Scanner;

public class _10_sidesOfTriangle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the 1st sides of triangle : ");
            int a = sc.nextInt();
            System.out.print("Enter the 2nd sides of triangle : ");
            int b = sc.nextInt();
            System.out.print("Enter 3rd sides of triangle : ");
            int c = sc.nextInt();
            if(a+b>c && b+c>a && c+a>b){
                System.out.println("Formation of triangle is possible");
            } else {
                System.out.println("Formation of triangle is not possible");
            }
        }
    }
}
