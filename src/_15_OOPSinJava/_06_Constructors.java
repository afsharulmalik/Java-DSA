package _15_OOPSinJava;

public class _06_Constructors {
    public static class Car{
        int seats;  // 0
        String name;  // null
        //double length;  // 0.0

        // ye wala car c3 k liye hai
        Car(String s, int x){  // default constructor
            name = s;
            seats = x;
        }
        Car(int x, String s){  // parametrized constructor
            seats = x;
            name = s;
//            length = d;
        }
        void print(){
            System.out.println(seats+" "+name);
        }
    }
    public static void main(String[] args) {
        // it is a special block of code used to initialize a newly created object in Java
        // It does not has a return type
        // It has the same name as the class and looks like a method

        // types of Constructors
        // 1. Default Constructor
        // 2. No argument Constructor
        // 3. Parametrized Constructor

        // Key concepts :- Constructor overloading :- agar ek hi naam ke
        // 2 constructor ho

        Car c1 = new Car(2, "Lambo");
        c1.print();
        c1.name = "Porche";  // ye update kar rha hai c1 ka length
        Car c2 = new Car(4, "Lord Alto");
        c2.print();
        Car c3 = new Car("BMW", 2);
        c3.print();
    }
}
