package dk.nikolaj.bankdatabase.datasource.mongodb.service.interfaces;

import dk.nikolaj.bankdatabase.datasource.mongodb.model.Customer;

import java.util.List;

public interface CustomerService {

    List<Customer> listAllCustomers();

    Customer getCustomer(Long id);

    void saveCustomer(Customer customer);

    void deleteCustomer(Long id);
}
