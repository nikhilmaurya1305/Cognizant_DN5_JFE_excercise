package AdapterPattern;

public class PhonePayAdapter implements PaymentProcessor{

    PhonePayGateway phonePayGateway = new PhonePayGateway();

    public PhonePayAdapter(PhonePayGateway phonePayGateway) {
        this.phonePayGateway = phonePayGateway;
    }

    @Override
    public void processPayment(double amount) {
        phonePayGateway.makeTransaction(amount);
    }
}
