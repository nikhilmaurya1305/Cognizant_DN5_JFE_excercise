package DesignPattern.DependencyInjection;

public class CustomerService {
    private CustomerRepository customerRepository;
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void execute(int id){
        customerRepository.findCustomerById(id);
    }
}
