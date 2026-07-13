package _08_Arrays;

// Find the element 'x' in the array. Take array and x as input.

import java.util.Scanner;
public class linearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the Array : ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        // Taking input of Array
        System.out.print("Enter the elements of the Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Searchable element
        System.out.print("Enter the element to be searched : ");
        int x = scanner.nextInt();

        // Algorithm
        boolean found = false;
        for(int i =0; i<n; i++){
            if(arr[i]==x){
                System.out.print("The element is present in the Array at index : "+i);
                found = true;
                break;
            }
        }
        if (!found){ // this will show up if the array have no required index
            System.out.print("The given element is not present in the given Array.");
        }
    }
}
