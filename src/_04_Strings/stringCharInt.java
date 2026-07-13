package _04_Strings;

import java.util.Scanner;

public class stringCharInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "abc";
        str = str + "xyz"; // we can add anything in an another string
        str +=10;
        str += 'i';
        System.out.println(str);
    }
}
