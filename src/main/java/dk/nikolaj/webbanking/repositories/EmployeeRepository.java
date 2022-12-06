package dk.nikolaj.webbanking.repositories;

import dk.nikolaj.webbanking.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
