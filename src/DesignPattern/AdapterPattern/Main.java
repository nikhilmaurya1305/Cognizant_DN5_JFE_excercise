package DesignPattern.AdapterPattern;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor gpay = new GpayAdapter(new GpayGateway());
        PaymentProcessor phonepay = new PhonePayAdapter(new PhonePayGateway());

        gpay.processPayment(1000);
        phonepay.processPayment(3590);
    }
}
