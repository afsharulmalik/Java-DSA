package _07_Methods;

import java.util.Scanner;

public class swap2num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        // using 3rd variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+ " " +b);

        // without using 3rd variable
//        a = a+b;
//        b = a-b;
//        a = a-b;
//        System.out.println(a+ " " +b);
    }
}
