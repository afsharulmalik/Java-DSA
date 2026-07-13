package _08_Arrays;

import java.util.Arrays;

public class _11_SortArrayBuiltIn {
    public static void main(String[] args) {
        int[] arr = {4,1,5,67,89,90,43};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
