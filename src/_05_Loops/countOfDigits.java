package _05_Loops;

import java.util.Scanner;

public class countOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int count = 0;
        if(n==0){
            count++;
        }
        while(n!=0){
            n/=10;
            count++;
        }
        System.out.println("The total Digit in this number is "+count);
    }
}
