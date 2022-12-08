package dk.nikolaj.webbanking.datasource.mongodb.repositories;

import dk.nikolaj.webbanking.datasource.mongodb.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository("MongoCustomerRepository")
public interface CustomerRepository extends MongoRepository<Customer, Long> {
}
