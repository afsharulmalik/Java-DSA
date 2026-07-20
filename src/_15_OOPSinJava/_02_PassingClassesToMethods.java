package _15_OOPSinJava;

public class _02_PassingClassesToMethods {
    public static class Car{
        int seats;
        String name;
        String type;
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.seats = 4;
        c.name = "BMW";
        c.type = "Sports";

        change(c);

        System.out.print(c.seats);
    }
    private static void change(Car x){
        x.seats = 2;
    }
}

// object ko methods mein bhejte hai toh pass by reference hota hai 
