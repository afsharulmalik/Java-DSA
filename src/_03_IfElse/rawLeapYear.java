package _03_IfElse;

import java.util.Scanner;

public class rawLeapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter any year : ");
            int a = sc.nextInt();
            if(a%4==0){
                System.out.println("Entered year is a leap year");
            } else {
                System.out.println("Entered year is not a leap year");
            }
        }
    }
}
