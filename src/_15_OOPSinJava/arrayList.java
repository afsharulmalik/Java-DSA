package _15_OOPSinJava;

import java.util.*;

public class arrayList {
    // Dynamic Array : jo array grow hote rhta hai !!
    // Jaise hi iska size full ho jaata hai waise hi ye apna size double kar leta hai !!!

    public static class arraylist {
        int [] arr = new int[2];
        int idx =0;
        int size =0;
        public void add(int element){
            if(size == arr.length){
                int[] brr = Arrays.copyOf(arr, arr.length*2);
                arr = brr;
            }
              arr[idx] = element;
              idx++;
              size++;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(1);
        System.out.println(arr.size());
        arr.add(5);
        System.out.println(arr.size());
        System.out.println(arr);
        arr.set(0,69);
        System.out.println(arr);
    }
}
