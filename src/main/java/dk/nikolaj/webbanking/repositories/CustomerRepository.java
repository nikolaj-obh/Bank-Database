package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
