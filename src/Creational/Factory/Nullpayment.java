package Creational.Factory;

public class Nullpayment implements IPay {
    @Override
    public void pay(double payment) {
        System.out.println("You choose wrong pathway for payment");
    }
}
