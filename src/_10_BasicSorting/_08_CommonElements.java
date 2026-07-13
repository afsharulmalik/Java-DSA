package _10_BasicSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _08_CommonElements {
    public static ArrayList commonElements(int n, int[] a, int m, int[] b){
        Arrays.sort(a);
        Arrays.sort(b);
        int i=0;
        int j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i<n && j<m){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            } else if(a[i]>b[j]) j++;
            else i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q. Given two integer array a[] and b[]. Return the list of
        // elements common to both the lists and return the list in sorted order.
        // Duplicates may be there in the output list.

        System.out.print("Enter the no of elements of array(a) : ");
        int n = sc.nextInt();

        System.out.print("Enter Array elements of array(a) : ");
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter the no of elements of array(b) : ");
        int m = sc.nextInt();

        System.out.print("Enter Array elements of array(b) : ");
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> result = commonElements(n, a, m, b);

        if (result.isEmpty()) {
            System.out.println("No common elements found.");
        } else {
            System.out.println("Common elements: " + result);
        }
    }
}
