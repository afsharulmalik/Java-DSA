package _04_Strings;

import java.util.Scanner;

// Q. Given a string, the task is to toggle all the characters of the string i.e., to convert Upper case
//    to Lower case and vice-versa.

//  Input : PHysiCs
//  Output : phYSIcS

public class toggleQuestionString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "PHysiCs";
        System.out.println(str);
        for(int i=0; i<str.length(); i++){
            boolean flag = true; // mtlb letter capital hai
            char ch = str.charAt(i);
            if(ch==' ') continue;
            int ascii = (int)ch;
            if(ascii>=97){
                flag = false;
            }
            if(flag){  // flag==true
                ascii = ascii +32;
                char dh = (char)ascii;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
            else{
                ascii = ascii -32;
                char dh = (char)ascii;
                str = str.substring(0,i) + dh + str.substring(i+1);
            }
        }
        System.out.println(str);
    }
}
