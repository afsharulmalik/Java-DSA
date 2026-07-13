package _03_IfElse;

import java.util.Scanner;

public class _13_liesOnLines {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the value of x : ");
            int x = sc.nextInt();
            System.out.print("Enter the value of y : ");
            int y = sc.nextInt();
            if(x==0 && y==0){
                System.out.println("The points lies on the origin");
            } else if (x==0){
                System.out.println("The points lies on the y axis");
            } else if (y==0) {
                System.out.println("The points lies on the x axis");
            } else {
                System.out.println("The points doesn't lies on any axis.");
            }
        }
    }
}
