package dk.nikolaj.webbanking.datasource.neo4j.service;

import dk.nikolaj.webbanking.datasource.neo4j.model.Customer;
import dk.nikolaj.webbanking.datasource.neo4j.repositories.CustomerRepository;
import dk.nikolaj.webbanking.datasource.neo4j.service.interfaces.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Neo4jCustomerServiceImpl")
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
