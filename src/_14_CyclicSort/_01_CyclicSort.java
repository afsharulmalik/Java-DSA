package _14_CyclicSort;

public class _01_CyclicSort {
    public static void cyclicSort(int[] arr){
        int i = 0;
        while(i<arr.length){
            int pos = arr[i] - 1;
            if(arr[i] != arr[pos]){
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
            }else{
                i++;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr= {3,5,4,1,2};
        cyclicSort(arr);
        for(int ele : arr) System.out.print(ele+" ");
    }
}
