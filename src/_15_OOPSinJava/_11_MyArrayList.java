package _15_OOPSinJava;

class Student {
    int id;
    String name;
    Student(int id, String name) {  // Constructor
        this.id = id;
        this.name = name;
    }
    void display() {
        System.out.println(id + " " + name);
    }
}

class MyArrayList {
    private Student[] arr;
    private int size;
    private int capacity;
    MyArrayList() {
        capacity = 2;
        arr = new Student[capacity];
        size = 0;
    }

    // ===================== ADD =====================
    void add(Student s) {
        if (size == capacity)
            increaseCapacity();
        arr[size] = s;
        size++;
    }

    // ===================== INSERT =====================
    void insert(int index, Student s) {
        if (index < 0 || index > size) {
            System.out.println("Invalid Index");
            return;
        }
        if (size == capacity)
            increaseCapacity();
        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = s;
        size++;
    }

    // ===================== REMOVE =====================
    void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null;
        size--;
    }

    // ===================== GET =====================
    Student get(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return null;
        }
        return arr[index];
    }

    // ===================== SET =====================
    void set(int index, Student s) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid Index");
            return;
        }
        arr[index] = s;
    }

    // ===================== CONTAINS =====================
    boolean contains(Student s) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == s)
                return true;
        }
        return false;
    }

    // ===================== CLEAR =====================
    void clear() {
        for (int i = 0; i < size; i++) {
            arr[i] = null;
        }
        size = 0;
    }

    // ===================== SIZE =====================
    int size() {
        return size;
    }

    // ===================== CAPACITY =====================
    int capacity() {
        return capacity;
    }

    // ===================== EMPTY =====================
    boolean isEmpty() {
        return size == 0;
    }

    // ===================== DISPLAY =====================
    void display() {
        if (size == 0) {
            System.out.println("List Empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            arr[i].display();
        }
    }

    // ===================== RESIZE =====================
    private void increaseCapacity() {
        System.out.println("Capacity Increased : " + capacity + " -> " + (capacity * 2));
        capacity *= 2;
        Student[] temp = new Student[capacity];
        for (int i = 0; i < size; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }
}

public class _11_MyArrayList {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println("Initial Capacity : " + list.capacity());
        System.out.println("Initial Size : " + list.size());

        Student s1 = new Student(101, "Rahul");  // this is object
        Student s2 = new Student(102, "Aman");
        Student s3 = new Student(103, "Malik");
        Student s4 = new Student(104, "Ali");
        Student s5 = new Student(105, "Zaid");

        // ADD
        list.add(s1);
        list.add(s2);

        System.out.println("\nAfter Adding 2 Students");
        list.display();

        // Automatic Resize
        list.add(s3);

        System.out.println("\nAfter Adding 3rd Student");
        list.display();

        // INSERT
        list.insert(1, s4);

        System.out.println("\nAfter Insert");
        list.display();

        // REMOVE
        list.remove(2);

        System.out.println("\nAfter Remove");
        list.display();

        // GET
        System.out.println("\nGet Index 1");
        list.get(1).display();

        // SET
        list.set(1, s5);

        System.out.println("\nAfter Set");
        list.display();

        // CONTAINS
        System.out.println("\nContains s1 : " + list.contains(s1));
        System.out.println("Contains s2 : " + list.contains(s2));

        // SIZE & CAPACITY
        System.out.println("\nSize : " + list.size());
        System.out.println("Capacity : " + list.capacity());

        // CLEAR
        list.clear();

        System.out.println("\nAfter Clear");
        System.out.println("Is Empty : " + list.isEmpty());
        System.out.println("Size : " + list.size());
    }
}
