package _08_Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class _22_ArrayListInJava {
    public static void main(String[] args) {
        // syntax
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(56);
        arr.add(69);
        arr.add(29); // it means that array mein 56 69 ke baad ye add ho gyaa and so one for next elements
        arr.add(45);
        arr.add(33);
        arr.add(67);

        System.out.println(arr.size());  // 6
        System.out.print(arr.get(2));   // 29
        arr.set(1,89);

        System.out.println();

        // for printing whole array in arrayList
        System.out.println(arr);   // [56, 89, 29, 45, 33, 67]

        arr.add(3,109);  // 56 89 29 109 45 33 67
        // arr.add(int index, int element) -> ye hone par uss index par new value daal diya jaata hai
        // without changing the element existing at that element

        System.out.println(arr);   // [56, 89, 29, 109, 45, 33, 67]

        // inbuilt method to reverse Array
        Collections.reverse(arr);
        System.out.println(arr);   // [67, 33, 45, 109, 29, 89, 56]

        // own method or procedure to reverse ArrayList
        int i=0;
        int j=arr.size()-1;
        while (i<j){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j,temp);
            i++;
            j--;
        }
        System.out.println(arr);
    }
}
