package dk.nikolaj.webbanking.datasource.neo4j.service;

import dk.nikolaj.webbanking.datasource.neo4j.model.Employee;
import dk.nikolaj.webbanking.datasource.neo4j.repositories.EmployeeRepository;
import dk.nikolaj.webbanking.datasource.neo4j.service.interfaces.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Neo4jEmployeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> listAllEmployees() {
        return employeeRepository.findAll();
    }

    public Employee getEmployee(Long id) {
        return employeeRepository.findById(id).get();
    }

    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }
}
