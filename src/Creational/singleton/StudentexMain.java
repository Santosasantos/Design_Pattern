package Creational.singleton;

public class StudentexMain {
    public static void main(String[] args) {
        Studentex a=Studentex.getStu("C","3",22,3.00);
        Studentex b=Studentex.getStu("D","4",21,3.50);
        //here b object will not invoke because in Studentex class getStu() method ensures only one object creation
        System.out.println(a);
        System.out.println(b);

    }
}
