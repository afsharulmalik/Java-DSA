package _04_Strings;

import java.util.Scanner;

public class equals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(s1==s3); // this compare the address of the String
        System.out.println(s1==s2);
        System.out.println(s1.equals(s3));  // it compares the string value
    }
}
