package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Employee;
import mp.hbsapi.entity.request.GetEmployeeRequest;
import mp.hbsapi.entity.request.UpdateSalaryRequest;
import mp.hbsapi.repository.EmployeeRepository;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.getAllEmployeesWithType();
    }

    @Override
    public Character getEmployeeTypeByUsername(String username) {
        return employeeRepository.getEmployeeTypeByUsername(username);
    }

    @Override
    public String updateEmployeeSalary(int employeeId, UpdateSalaryRequest updateSalaryRequest) {
        try {
            // Assuming employeeId is a single value, not a list
            // If it's a list, you might need a loop here
            employeeRepository.updateSalary(employeeId, updateSalaryRequest.getNewSalary());

            return "Salary updated successfully";
        } catch (EmptyResultDataAccessException e) {
            return "Employee not found";
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to update salary";
        }
    }
}
