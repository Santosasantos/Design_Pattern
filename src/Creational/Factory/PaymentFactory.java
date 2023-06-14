package Creational.Factory;

public class PaymentFactory {
    public IPay getpaymentway(String str){
        if(str.equals("Bkash")) return new Bkash();
        if(str.equals("Nagad")) return new Nagad();
        return new Nullpayment();
    }
}
