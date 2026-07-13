package _08_Arrays;

// Q. Count the number of elements in the given Array greater than a given number x.

import java.util.Scanner;

public class countNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Size of the Array
        System.out.print("Enter the number of elements in the Array : ");
        int n = scanner.nextInt();

        // Elements of the Array
        int[] arr = new int[n];
        System.out.print("Enter the elements of the Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Algorithm

        System.out.print("Enter the value of x : ");
        int x = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>x){
                count++;
            }
        }
        System.out.println("The total number of element greater than "+x+" is : "+count);
    }
}
