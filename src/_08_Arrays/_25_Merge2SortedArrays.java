package _08_Arrays;

import java.util.Scanner;

public class _25_Merge2SortedArrays {

    // Print Function
//    public static void print(int[] arr){
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }

    public static int merge(int[] arr3, int[] arr1, int[]arr2){
        int i=0;   // for arr1
        int j=0;   // for arr2
        int k=0;   // for arr3
        while(i<arr1.length && j<arr2.length){  // both condition has to be true
            int val;  // this will hold the value of arr1 or arr2 before inserting into arr3
            if(arr1[i] == arr2[j]){
                val = arr1[i];
                i++;
                j++;
            }
            else if(arr1[i]<arr2[j]){
                val = arr1[i];
                i++;
            }else{
                val = arr2[j];
                j++;
            }

            // Insert val if arr3 is empty or last inserted val is different
            if(k == 0 || arr3[k-1] != val){  // any one condition must be true
                arr3[k] = val;
                k++;
            }
        }

        // Insert remaining elements from arr1
        while (i<arr1.length){
            if(k == 0 || arr3[k-1] != arr1[i]){
                arr3[k] = arr1[i];
                k++;
            }
            i++;
        }

        // Insert remaining elements from arr2
        while (j<arr2.length){
            if(k == 0 || arr3[k-1] != arr2[j]){
                arr3[k] = arr2[j];
                k++;
            }
            j++;
        }
        return k;
    }

    public static void main(String[] args) {
        // Mostly asked in interviews questions similar to merge sort
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of Array1 : ");
        int n1 = sc.nextInt();

        System.out.print("Enter Sorted Array elements : ");
        int[] arr1 = new int[n1];
        for(int i=0; i<n1; i++){
            arr1[i] = sc.nextInt();
        }

        System.out.print("Enter size of Array2 : ");
        int n2 = sc.nextInt();

        System.out.print("Enter Sorted Array elements : ");
        int[] arr2 = new int[n2];
        for(int i=0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }


        int[] arr3 = new int[n1+n2];
        int size = merge(arr3, arr1, arr2);
        System.out.print("The new Merged Array is : ");
        for(int i=0; i<size; i++){
            System.out.print(arr3[i]+" ");
        }
    }
}


// Absolutely! Let me explain those lines step-by-step:
//
//```java
//while (i < arr1.length) {
//    if (k == 0 || arr3[k - 1] != arr1[i]) {
//        arr3[k] = arr1[i];
//        k++;
//    }
//    i++;
//}
//```
//
//---
//
//### What this block is doing:
//
//**This loop handles the case when `arr1` still has elements left to be merged after `arr2` is exhausted.**
//
//---
//
//### Line-by-line explanation:
//
//---
//
//#### 1. `while (i < arr1.length) {`
//
//* This means: **Keep looping as long as we haven’t processed all elements in `arr1`**.
//* `i` is the index pointer for `arr1`.
//* When this loop runs, `arr2` is already fully processed (or no more elements to compare), so we just copy the remaining `arr1` elements.
//
//---
//
//#### 2. `if (k == 0 || arr3[k - 1] != arr1[i]) {`
//
//* This condition **prevents duplicate elements** from being inserted.
//* `k` is the index pointer in the merged array `arr3`.
//
//Breaking it down:
//
//* `k == 0`: If no elements have been inserted into `arr3` yet (meaning it’s empty), then it’s safe to insert any element.
//* `arr3[k - 1] != arr1[i]`: If the **last inserted element in `arr3`** is **not equal** to the current element in `arr1`, then insert it.
//
//This check ensures **no duplicate adjacent elements** are added in the merged array.
//
//---
//
//#### 3. `arr3[k] = arr1[i];`
//
//* Insert the current element of `arr1` at position `k` in the merged array `arr3`.
//
//---
//
//#### 4. `k++;`
//
//* Move the insertion pointer in `arr3` forward by 1, preparing to insert the next element.
//
//---
//
//#### 5. `i++;`
//
//* Move the pointer in `arr1` forward by 1 to process the next element in the next loop iteration.
//
//---
//
//### Summary:
//
//* This loop **copies remaining elements from `arr1` to `arr3`**.
//* It **avoids duplicates** by comparing the current element with the last inserted element.
//* It continues until **all elements in `arr1` are processed**.
//
//---
//
//If you want, I can illustrate it with a quick example! Would you like that?