package _13_Strings;

import java.util.Scanner;

public class _01_NoOfVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();

        // iss tarah par string par iterate krte hai
//        for(int i=0; i<str.length();i++){
//            System.out.print(str.charAt(i));
//        }

        // main question
        int count =0;
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        System.out.print(count);
    }
}
