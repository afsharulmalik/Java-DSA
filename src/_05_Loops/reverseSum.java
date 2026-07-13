package _05_Loops;

import java.util.Scanner;

public class reverseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        int givenNumber = n;
        int rev = 0;
        while (n!=0){
            int lastDigit = n%10;
            rev = rev*10+lastDigit;
            n/=10;
        }
        int output = rev + givenNumber;
        System.out.println("The sum of given number and it's reverse is "+output);
    }

}
