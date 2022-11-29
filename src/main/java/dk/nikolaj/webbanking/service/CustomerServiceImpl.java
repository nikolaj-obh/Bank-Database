package dk.nikolaj.webbanking.service;

import dk.nikolaj.webbanking.model.Customer;
import dk.nikolaj.webbanking.repositories.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Slf4j
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> listAllCustomers() {
        return customerRepository.findAll();
    }

    public void saveCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public Customer getCustomer(Long ID) {
        return customerRepository.findById(ID).get();
    }

    public void deleteCustomer(Long ID) {
        customerRepository.deleteById(ID);
    }
}
