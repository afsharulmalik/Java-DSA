package _15_OOPSinJava;

// Robot class outside main
class Robot {
    String name;

    // Constructor
    public Robot(String robotName) {
        name = robotName;
        System.out.println(name + " is ready!");
    }
}

public class Constructor {
    public static void main(String[] args) {
        // Create a robot named "Alexa"
        Robot myRobot = new Robot("Alexa"); // Output: "Alexa is ready!"
    }
}
