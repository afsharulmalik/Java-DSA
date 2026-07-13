package _09_2dArrays;

public class _08_SnakePatternRowWise {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,9,9,1,4},{3,1,8,2,6}};
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                for(int j=0; j<arr[0].length; j++){
                    System.out.print(arr[i][j]+" ");
                }
            } else {
                for(int j=arr[0].length-1; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
