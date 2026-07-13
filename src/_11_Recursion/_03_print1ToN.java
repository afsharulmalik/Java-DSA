package _11_Recursion;

import java.util.Scanner;

public class _03_print1ToN {

    // Interview mein ye wala concept se karna hai ye wala code ki quality jyada achii hai


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        print(1,n);
    }
    public static void print(int x,int n){
        if(x>n) return;
        System.out.println(x);
        print(x+1,n);
    }
}
