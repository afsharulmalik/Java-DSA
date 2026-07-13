package _04_Strings;

import java.util.Scanner;

// Q. Given a string, the task is to toggle all the characters of the string i.e., to convert Upper case
//    to Lower case and vice-versa.

//  Input : PHysiCs
//  Output : phYSIcS

public class toggleQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String : ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        // toggle
        // PHysiCs -> phYSIcS
        for(int i=0; i<str.length(); i++){
            //P -> p
            // check v krna hai ke capital hai ya small
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
                str.setCharAt(i,dh);
            }
            else{
                ascii = ascii -32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);
            }
        }
        System.out.println(str);
    }
}
