package _13_Strings;

import java.util.Scanner;

public class _06_IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Integer : ");
        int n = sc.nextInt();
        // Method 1
//        String str = "";
//        str+=n;
        String str = Integer.toString(n);
        System.out.print(str);
    }
}
