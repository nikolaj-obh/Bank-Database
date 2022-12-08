package dk.nikolaj.webbanking.datasource.mysql.repositories;

import dk.nikolaj.webbanking.datasource.mysql.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
