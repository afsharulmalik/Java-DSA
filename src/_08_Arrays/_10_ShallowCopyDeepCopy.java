package _08_Arrays;

import java.util.Arrays;

public class _10_ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        int[] x= arr; // this is shallow Copy
        x[0] = 100;
        System.out.println(arr[0]);


        System.out.println();

        // deep copy
        int[] y = Arrays.copyOf(arr,arr.length);
        y[0] = 99;
        System.out.println(y[0]);
        System.out.println(arr[0]);

        // shallow copy is fast deep copy is fast
        // shallow copy takes less storage but deep copy takes more storage.
    }
}
