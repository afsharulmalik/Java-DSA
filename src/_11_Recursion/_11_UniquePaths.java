package _11_Recursion;

import java.util.Scanner;

public class _11_UniquePaths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int m = sc.nextInt();
        int result = uniquePaths(n, m);
        System.out.println("Total unique paths = " + result);
    }
    public static int uniquePaths(int n, int m) {
        if (n == 1 || m == 1) return 1;
        return uniquePaths(n, m - 1) + uniquePaths(n - 1, m);
    }
}


//
// Time Complexity : Exponential → O(2^(n+m))
//
// Space Complexity : O(n+m) (because of recursion stack)
