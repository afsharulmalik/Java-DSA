package _08_Array;

public class InitializationOfArrays {
    public static void main(String[] args) {
//        int[] arr = {23,45,89,6,34,12};
//        System.out.println(3);
//        arr[2] = 55;
        // by default 0 store hota hai array ke elements mein on every index
        int[] arr = {23,45,89,6,34,12};
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
