package _04_Strings;

import java.util.Scanner;

// Q. wap in java to reverse each word in string
// Input : I am a student
// Output : I ma a tneduts

public class reverseInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "I am a student";
        String ans = "";
        StringBuilder str = new StringBuilder("");
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                str.append(ch);
            }
            else {
                str.reverse();
                ans += str;
                ans += " ";
                str = new StringBuilder();
            }
        }
        str.reverse();
        ans += str;
        System.out.println(ans);
    }
}
