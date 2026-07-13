package _13_Strings;

import java.util.Scanner;

public class _07_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int n = sc.nextInt();
        String str = Integer.toString(n);
        System.out.print(str.length());
    }
}
