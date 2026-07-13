package _03_IfElse;

import java.util.Scanner;

public class _12_straightLine {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter x1 : ");
            double x1 = sc.nextInt();
            System.out.print("Enter y1 : ");
            double y1 = sc.nextInt();
            System.out.print("Enter x2 : ");
            double x2 = sc.nextInt();
            System.out.print("Enter y2 : ");
            double y2 = sc.nextInt();
            System.out.print("Enter x3 : ");
            double x3 = sc.nextInt();
            System.out.print("Enter y3 : ");
            double y3 = sc.nextInt();
            double m1 = ((y2-y1)/(x2-x1));
            double m2 = ((y3-y2)/(x3-x2));
            if(m1==m2){
                System.out.println("Three points lies on a single line");
            } else {
                System.out.println("Three points doesn't lies on the straight line");
            }
        }
    }
}
