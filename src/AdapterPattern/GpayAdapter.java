package AdapterPattern;

public class GpayAdapter implements PaymentProcessor{

    GpayGateway gpayGateway = new GpayGateway();

    public GpayAdapter(GpayGateway gpayGateway) {
        this.gpayGateway = gpayGateway;
    }

    @Override
    public void processPayment(double amount) {
        gpayGateway.makePayment(amount);
    }
}
