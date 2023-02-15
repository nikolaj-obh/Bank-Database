package dk.nikolaj.bankdatabase.datasource.mongodb.service;

import dk.nikolaj.bankdatabase.datasource.mongodb.model.Employee;
import dk.nikolaj.bankdatabase.datasource.mongodb.repositories.EmployeeRepository;
import dk.nikolaj.bankdatabase.datasource.mongodb.service.interfaces.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MongoEmployeeServiceImpl")
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
