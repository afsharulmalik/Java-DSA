package _09_2DArrays;

public class _10_ReverseRows {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,9,9,1,4},{3,1,8,2,6}};
        for(int i=arr.length-1; i>=0; i--){
            int left = 0;
            int right = arr.length;
            while (left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("The reversed rows and columns of the given matrix is :");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
