package _15_OOPSinJava;
class Students{
    String name;  // default value null aata hai
    private int rno;  // default value 0 hota hai
    double cgpa;  // default value 0.0 aata hai

    //  within this we can access the private keyword but not out of this

    private void print(){
        System.out.println(name+" "+rno+" "+cgpa);
    }
    // ye upar wala print ek private function hai isko v bahar access nahi kar skte hai
    // to access this out we need a new function

    public void p(){
        print();
    }
}
public class _05_PrivateKeyword {

    public static void main(String[] args) {
        Students s1 = new Students();
//        s1.rno = 67;
//        System.out.println(s1.rno);   this cant be accessed bcoz it is a private keyword

        s1.p();
        s1.cgpa = 7.9;
        s1.name = "Afsharul";
        s1.p();
        Students s2 = new Students();
        s2.p();

    }
}
