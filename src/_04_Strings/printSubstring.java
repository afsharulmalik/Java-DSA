package _04_Strings;

import java.util.Scanner;

public class printSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ="abcd";
        for(int i =0; i<=3; i++){  // loop 0 se lekr 3 tk jaa rha hai
            for(int j= i+1; j<=4; j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
