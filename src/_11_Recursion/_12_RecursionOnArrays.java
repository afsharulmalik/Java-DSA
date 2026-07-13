package _11_Recursion;

public class _12_RecursionOnArrays {
    public static void main(String[] args) {
        int[] arr = {5,6,4,34,7,9,12,56,90,4,23,69};
//        recPrint(arr,0);
//        recPrintReverse(arr, 0);
        int target = 980;  // this is for boolean function
        System.out.print(exists(arr,target,0));
    }
    public static boolean exists(int[] arr, int target, int idx){
        if(idx == arr.length) return false;  // base case
        if(arr[idx]==target) return true;
        return exists(arr,target,idx+1);
    }


    public static void recPrint(int[] arr, int idx){
        int n = arr.length;
        if(idx == n) return;
        System.out.print(arr[idx]+" ");
        recPrint(arr,idx+1);
    }

    // this function prints the same array in the reverse order
    public static void recPrintReverse(int[] arr, int idx){
        if(idx == arr.length) return;
        recPrintReverse(arr,idx+1);
        System.out.print(arr[idx]+" ");
    }
}
