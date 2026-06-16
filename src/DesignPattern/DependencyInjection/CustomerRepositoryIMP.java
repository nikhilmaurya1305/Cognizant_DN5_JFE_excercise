package DesignPattern.DependencyInjection;

public class CustomerRepositoryIMP implements CustomerRepository {
    @Override
    public void findCustomerById(int id) {
        System.out.println("Find customer by id: " + id);
    }
}
