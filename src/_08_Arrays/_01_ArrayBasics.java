package _08_Arrays;

public class _01_ArrayBasics {
    public static void main(String[] args) {
        int[] x = {1,5,69,90,234,89};
        // indexing
        System.out.println(x[5]);
        // updating Values - mutable
        x[4] = 100;
        System.out.println(x[4]);
        int[] arr = new int[6];   // its index can go from 0 to 5
        arr[0] = 10;
        arr[1] = 100;
        arr[2] = 19;
        arr[3] = 340;
        arr[4] = 1090;
        arr[5] = 1023;
        System.out.println(arr[5]);
    }
}
