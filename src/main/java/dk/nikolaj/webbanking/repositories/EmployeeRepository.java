package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
