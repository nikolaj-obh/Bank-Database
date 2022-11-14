package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
