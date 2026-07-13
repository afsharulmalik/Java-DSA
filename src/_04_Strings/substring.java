package _04_Strings;

import java.util.Scanner;

public class substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // substring : it is basically a continuous part of a string
        // eg : str = "abcd" its substring are a, b,c,d,ab,ac,ad,bc,bd,cd,abc,abd,acd,bcd,abcd
        String str = "abcde";
        System.out.println(str.substring(0,3));
        System.out.println(str.substring(2,3));
        System.out.println(str.substring(3));
    }
}
