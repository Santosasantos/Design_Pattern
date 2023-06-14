package Creational.Factory;

public class Bkash implements IPay {
    public void pay(double payment) {
        System.out.println(payment + " paid by Bkash");
    }
}
