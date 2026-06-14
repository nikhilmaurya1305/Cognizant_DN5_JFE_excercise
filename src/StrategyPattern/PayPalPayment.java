package StrategyPattern;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payment with PayPal of amount:" + amount + ".");
    }
}
