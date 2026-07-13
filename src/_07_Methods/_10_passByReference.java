package _07_Methods;

// 🔸 Reference is copied — but it still points to the same object. So changes inside the object stay.
class Person {
    String name;
}

public class _10_passByReference {
    static void changeName(Person p) {
        p.name = "Ravi";
    }

    public static void main(String[] args) {
        Person obj = new Person();
        obj.name = "Raj";
        changeName(obj);
        System.out.println(obj.name); // Ravi
    }
}
