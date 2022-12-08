package dk.nikolaj.webbanking.datasource.mongodb.service;

import dk.nikolaj.webbanking.datasource.mongodb.model.Customer;
import dk.nikolaj.webbanking.datasource.mongodb.repositories.CustomerRepository;
import dk.nikolaj.webbanking.datasource.mongodb.service.interfaces.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MongoCustomerServiceImpl")
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> listAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomer(Long id) {
        return customerRepository.findById(id).get();
    }

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(Long id) {
        customerRepository.deleteById(id);
    }
}
