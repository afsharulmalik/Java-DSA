package _03_IfElse;

import java.util.Scanner;

public class _05_absoluteValue {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter any value : ");
            int a = sc.nextInt();
            if(a<0){
                System.out.print("The absolute value is "+(-1*a));
            } else {
                System.out.print("The absolute value is "+a);
            }
        }
    }
}
