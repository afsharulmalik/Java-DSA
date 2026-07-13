package _08_Arrays;

import java.util.Scanner;

public class passingArrayToMethods {
    public static void swap(int[] arr) {
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // isme agar array ka naam alag v kare tab v value change ho jaate hai lekin int agar hoga sirf toh change nahi
        // hoga............Iss method ka use karke hum swapping of 2 numbers wala program kar skteee hai but iske bina nahi
        // hoga............

        // isme pass by reference hota hai pass by value nahi
        // aur array ko agar pass karenge toh same array nahi banega......woh whi array hoga bss uska ek aur naam allot ho jaayega

        int[] arr= {10,20};
        System.out.println(arr[0]+" "+arr[1]);
        swap(arr);
        System.out.println(arr[0]+" "+arr[1]);
    }
}
