package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Employee;
import mp.hbsapi.entity.request.GetEmployeeRequest;
import mp.hbsapi.entity.request.UpdateSalaryRequest;
import mp.hbsapi.service.EmployeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees() {
        return new ResponseEntity<>(employeeService.getAllEmployees(), HttpStatus.OK);
    }

    @GetMapping("/type/{username}")
    public ResponseEntity<Character> getEmployeeTypeByUsername(@PathVariable String username) {
        return new ResponseEntity<>(employeeService.getEmployeeTypeByUsername(username), HttpStatus.OK);
    }

    @PatchMapping("/update-salary/{employeeId}")
    public ResponseEntity<String> updateEmployeeSalary(@PathVariable int employeeId, @RequestBody UpdateSalaryRequest updateSalaryRequest) {
        String result = employeeService.updateEmployeeSalary(employeeId, updateSalaryRequest);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}
