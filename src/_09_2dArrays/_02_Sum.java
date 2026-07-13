package _09_2dArrays;

public class _02_Sum {
    public static void main(String[] args) {
        int[][] arr = {{5,6,3,1,3},{3,5,6,0,9},{2,6,0,8,5}};
        int sum =0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                sum+=arr[i][j];
            }
        }
        System.out.print("The sum of the given 2D Array is : "+sum);
    }
}
