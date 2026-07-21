package _15_OOPSinJava;

public class _04_Polymorphism {
    public static class Dog{
        void sound(){
            System.out.println("Bark");
        }
    }
    public static class Cat{
        void sound(){
            System.out.println("Meow Meow");
        }
    }
    public static class Lion{
        void sound(){
            System.out.println("Roar");
        }
    }
    public static class Human{
        void sound(){
            System.out.println("Hello");
        }
    }
    public static void main(String[] args) {
        Human h = new Human();
        Lion l = new Lion();
        Cat c = new Cat();
        Dog d = new Dog();

        h.sound();
        l.sound();
        c.sound();
        d.sound();
    }
}
