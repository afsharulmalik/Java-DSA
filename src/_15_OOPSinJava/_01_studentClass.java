package OOPSinJava;


public class _01_studentClass {
    // creating a new data type


    public static class Car {
        String name;
        String type;
        int price;
    }

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.name = "Alto";
        c1.type = "Vehicle";
        c1.price = 450450;

        StudentClassFiles.Student s1 = new StudentClassFiles.Student();  // decleration
        s1.name = "Afsharul";
        s1.rollno = 67;
        s1.percentage = 85.98;

        System.out.println(s1.name);

    }
}
