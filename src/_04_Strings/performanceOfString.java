package _04_Strings;

import java.util.Scanner;
// the performance of String is poor because of worst time complexity
// we can improve the performance of string using String builders
public class performanceOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "A ";
        for(int i=1; i<=10; i++){
            str += i;
        }
        System.out.println(str);
    }

}
