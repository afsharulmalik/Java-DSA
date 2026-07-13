// pascal triangle
// iss grid ka har ek element iCj hai (i row hai and j column hai)
// isme phle hum iCj ko print karwaye hai uske baad beech mein spaces daale hai
// space print karwane ke liye spaces wale loop mein space print karwaye hai
// factorial ka function use kiye hai combination ko nikalne ke liye
// val = val * (i - j) / (j + 1);

package _07_Methods;

import java.util.Scanner;

public class _07_pascalTriangle {
    public static int fact(int a){
        int aFact = 1;
        for(int i =1; i<=a; i++){
            aFact *= i;
        }
        return aFact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for(int i = 0; i<=n; i++){
            for(int j = 1; j<=n-i; j++){   // spaces
                System.out.print(" "+" ");
            }
            for(int j = 0; j<=i; j++){
                int jFact = fact(j);
                int iFact = fact(i);
                int i_jFact = fact(i-j);
                int iCj = iFact/(jFact*i_jFact);
                System.out.print(iCj+" "+" "+" ");
            }
            System.out.println();
        }
    }
}


// chatGPT version
// this program is same as printing the star triangle but we just need to find the value of the next number in the row

//public class _07_pascalTriangle {
//    public static void main(String[] args) {
//        int rows = 5;
//
//        for (int i = 0; i < rows; i++) {
//            // 1️⃣ Print spaces to make it look like a triangle
//            for (int space = 0; space < rows - i; space++) {
//                System.out.print(" ");
//            }
//
//            int val = 1; // 2️⃣ First number in every row is always 1
//
//            // 3️⃣ Loop to print the numbers in the row
//            for (int j = 0; j <= i; j++) {
//                System.out.print(val + " ");
//                val = val * (i - j) / (j + 1); // 4️⃣ Calculate the next number in the row
//            }
//
//            System.out.println(); // 5️⃣ Move to the next line
//        }
//    }
//}

