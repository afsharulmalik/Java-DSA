package _08_Array;

public class _09_PassingArraysToMethods {
    public static void main(String[] args) {
        int[] x = {10,5,67,80};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    // here x is not an x array, it is a reference variable of array x
    // if we pass int[] y in place of int[] x then the value of x[2] will also change to 99
    // because it is a reference variable
    public static void change(int[] x){
        x[2]=99;
    }
}
