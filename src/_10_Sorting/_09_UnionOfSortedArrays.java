package _10_Sorting;

import java.util.ArrayList;
import java.util.Scanner;

public class _09_UnionOfSortedArrays {
    public static ArrayList unionOfArrays(int[] a,int[] b){
        int i=0;
        int j=0;
        ArrayList<Integer> ans = new ArrayList<>();
        while (i<a.length && j<b.length){
            if(a[i]<b[j]){
                ans.add(a[i]);
                i++;
            } else if(b[j]<a[i]){
                ans.add(b[j]);
                j++;
            } else {   // both are equal
                ans.add(a[i]);
                i++;
                j++;
            }
        }

        // for adding the remaining element of both the arrays in the arraylist
        while (i<a.length){
            ans.add(a[i]);
            i++;
        }
        while (j<b.length){
            ans.add(b[j]);
            j++;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

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

        ArrayList<Integer> result = unionOfArrays(a,b);

        System.out.print("Union of given Arrays : "+result);
    }
}
