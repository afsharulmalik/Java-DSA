package _08_Array;

public class _08_ArrayOfOtherDataTypes {
    public static void main(String[] args) {

        // array element of double data types is 0.0
        double[] arr = new double[8];
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }

        // character array
        char[] brr = new char[8];
        for(int i=0; i<brr.length; i++){
            System.out.println(brr[i]+" ");
        }

        // string Array
        String[] crr = {"Afsharul","Malik","Anand","Pawan","Rinkey"};
        for(int i=0; i<brr.length; i++){
            System.out.println(crr[i]+" ");
        }
    }
}
