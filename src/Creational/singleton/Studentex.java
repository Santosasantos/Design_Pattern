package Creational.singleton;

public class Studentex {
    public static Studentex stuex;
    private String name;
    private String id;
    private int age;
    private double gpa;

    private Studentex(String name,String id, int age, double gpa){
        this.name=name;
        this.id=id;
        this.age=age;
        this.gpa=gpa;
    }
    public static Studentex getStu(String name,String id, int age, double gpa){
        if(Studentex.stuex==null){
            Studentex.stuex=new Studentex(name, id, age, gpa);
        }
        return stuex;
    }

    public String toString() {
        return "Name: " + this.name + " Shanto";
    }

}
