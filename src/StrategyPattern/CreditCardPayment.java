package StrategyPattern;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payment with credit card of amount: " + amount);
    }
}
