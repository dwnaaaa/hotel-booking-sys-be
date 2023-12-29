package mp.hbsapi.service;

import mp.hbsapi.entity.Employee;
import mp.hbsapi.entity.request.GetEmployeeRequest;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
}
