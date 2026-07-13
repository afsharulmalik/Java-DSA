package _08_Array;

import java.util.Scanner;

public class rotateArray {
    // Helper function to reverse elements in array from index start to end
//    static void reverse(int[] a, int start, int end) {
//        while (start < end) {
//            int temp = a[start];
//            a[start] = a[end];
//            a[end] = temp;
//            start++;
//            end--;
//        }
//    }
//
//    // Rotate array to the right by k steps
//    static void rotateArray(int[] a, int k) {
//        int n = a.length;
//        k = k % n; // In case k > n
//
//        // Step 1: Reverse the whole array
//        reverse(a, 0, n - 1);
//
//        // Step 2: Reverse first k elements
//        reverse(a, 0, k - 1);
//
//        // Step 3: Reverse remaining n-k elements
//        reverse(a, k, n - 1);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        // Taking input
//        System.out.print("Enter the size of the array: ");
//        int n = sc.nextInt();
//        int[] a = new int[n];
//
//        System.out.print("Enter the elements of the array: ");
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        System.out.print("Enter the number of rotations (k): ");
//        int k = sc.nextInt();
//
//        // Rotate the array
//        rotateArray(a, k);
//
//        // Output the result
//        System.out.println("Rotated array: " + Arrays.toString(a));
//    }




        // Helper method to reverse elements in array from index start to end
    static void reverse(int[] a, int start, int end) {
        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        // Input elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Input number of rotations
        System.out.print("Enter number of rotations (k): ");
        int k = sc.nextInt();
        k = k % n; // In case k > n

        // Step 1: Reverse the whole array
        reverse(a, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(a, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(a, k, n - 1);

        // Output result
        System.out.println("Rotated array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
