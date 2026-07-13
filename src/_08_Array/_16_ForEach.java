package _08_Array;

import java.util.Scanner;

public class _16_ForEach {
    public static void main(String[] args) {

        // for each used to traverse data structure
        // cannot modify array elements using for each loop
        // because yahaa par array ki element ki copy bantii hai

        Scanner sc = new Scanner(System.in);

        int[] arr = {5,8,2,6,9};

        for(int ele : arr){  // for int element in array (aise padha jaata hai):   yahaa par ele ke jagah par kuch v le sktee hai
            System.out.print(ele+" ");
        }
    }
}
