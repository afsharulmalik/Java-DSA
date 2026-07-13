package _09_2DArrays;

import java.util.ArrayList;

public class _13_ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(56);
        a.add(678);
        a.add(874);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(107);
        b.add(87);
        b.add(68);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(170);
        c.add(69);
        ArrayList<ArrayList <Integer>> arr = new ArrayList<>();
        arr.add(a);
        arr.add(b);
        arr.add(c);

        // if u want to add a new arrayList in the arraylist
        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(10);
        arr.get(arr.size()-1).add(20);

        // this is for printing the elements of the arraylist using for loop
//        for(int i=0; i<arr.size(); i++){
//            for(int j=0; j<arr.get(i).size(); j++){
//                System.out.print(arr.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }

        // for printing using for each loop
        for(ArrayList<Integer> list : arr){
            for(int ele : list){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
