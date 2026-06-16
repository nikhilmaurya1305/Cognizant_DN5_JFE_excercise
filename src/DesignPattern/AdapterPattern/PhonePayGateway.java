package DesignPattern.AdapterPattern;

public class PhonePayGateway {
    public void makeTransaction(double amount) {
        System.out.println("Making transaction of"+amount+"with Phonepay");
    }
}
