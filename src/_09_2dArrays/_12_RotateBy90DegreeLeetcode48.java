package _09_2dArrays;

public class _12_RotateBy90DegreeLeetcode48 {
    public static void print(int[][] arr){
        for(int[] a: arr){
            for(int ele : a){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
        // transpose karenge
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
        System.out.println();  // it is a line break
        // Reverse kar denge
        for(int i=0; i<arr.length; i++){
            int left = 0;
            int right = arr.length-1;
            while (left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
        print(arr);
    }
}
