package DependencyInjection;

public class Main {
    public static void main(String[] args) {
        CustomerRepository repo = new CustomerRepositoryIMP();
        CustomerService service = new CustomerService(repo);

        service.execute(2);
    }
}
