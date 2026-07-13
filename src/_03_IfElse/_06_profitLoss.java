package _03_IfElse;

import java.util.Scanner;

public class _06_profitLoss {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the Cost price : ");
            int cp = sc.nextInt();
            System.out.print("Enter the Selling price : ");
            int sp = sc.nextInt();
            int profit = sp - cp;
            int loss = cp - sp;
            if(sp>cp){
                System.out.print("The shopkeeper gets the profit of "+profit);
            } if (cp>sp){
                System.out.println("The seller has the loss of "+loss);
            } if(cp==sp) {
                System.out.println("The seller gets neither any profit nor any loss");
            }
        }
    }
}
