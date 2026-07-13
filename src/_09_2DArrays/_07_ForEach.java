package _09_2DArrays;

public class _07_ForEach {
    public static void main(String[] args) {
        int[][] arr = {{2,8,3,4,7},{7,2,1,6,3},{5,9,9,1,4},{3,1,8,2,6}};

        // for each loop with for loop
        for(int i=0; i<arr.length; i++){
            for(int ele : arr[i]){
                System.out.print(ele +" ");
            }
            System.out.println();
        }

        // for each loop without for loop.............this concept is useful in graphs advanced dsa topic
//        for(int[] ele : arr){
//            for(int moon : ele){
//                System.out.print(moon +" ");
//            }
//            System.out.println();
//        }


    }
}
