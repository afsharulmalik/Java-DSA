package _08_Array;

// Multiply odd indexed elements by 2 and add 10 to even indexed elements.

import java.util.Scanner;

public class _12_IndexedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50,60};
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                arr[i]+=10;
            }else{
                arr[i]*=2;
            }
            System.out.println(arr[i]);
        }
    }
}
