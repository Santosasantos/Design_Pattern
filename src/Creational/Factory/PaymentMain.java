package Creational.Factory;

import java.util.Scanner;

public class PaymentMain {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String param=input.next();
        PaymentFactory p=new PaymentFactory();
        IPay i=p.getpaymentway(param);
        i.pay(3000);
    }
}
