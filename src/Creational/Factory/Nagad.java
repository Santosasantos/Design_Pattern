 package Creational.Factory;

public class Nagad implements IPay{
    @Override
    public void pay(double payment) {
        System.out.println(payment+" paid by Nagad");
    }
}
