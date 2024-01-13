package mp.hbsapi.service;

import mp.hbsapi.entity.Employee;
import mp.hbsapi.entity.request.GetEmployeeRequest;
import mp.hbsapi.entity.request.UpdateSalaryRequest;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Character getEmployeeTypeByUsername(String username);

    String updateEmployeeSalary(int employeeId, UpdateSalaryRequest updateSalaryRequest);
}
