package _08_Arrays;

public class _17_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {3,19,56,83,18,24,85,14};
        int n= arr.length;
        int i=0;   // left
        int j=n-1;   // right

        // Agar hum int i and int j ka value change kar de toh beech ke array ko reverse kar sktee hai without changing all array.

        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        // Alternate Method
//        for(int i=0; i<n/2; i++){
//            int temp = arr[i];
//            arr[i] = arr[n-i-1];
//            arr[n-i-1] = temp;
//        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
