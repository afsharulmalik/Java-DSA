package _09_2DArrays;

public class _03_MaximumElement {
    public static void main(String[] args) {
        int[][] arr = {{5,6,3,1,3},{3,5,6,0,9},{2,6,0,8,5}};
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
        }
        System.out.print("The maximum element of the given 2D Array is : "+max);
    }
}
