package dk.nikolaj.webbanking.datasource.mysql.service.interfaces;

import dk.nikolaj.webbanking.datasource.mysql.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> listAllEmployees();

    Employee getEmployee(Long id);

    void saveEmployee(Employee employee);

    void deleteEmployee(Long id);
}
