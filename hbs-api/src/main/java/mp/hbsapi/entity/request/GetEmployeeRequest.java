package mp.hbsapi.entity.request;

import lombok.*;
import mp.hbsapi.entity.Employee;
import mp.hbsapi.entity.EmployeeType;

@AllArgsConstructor
public class GetEmployeeRequest {
    private Employee employee;
    private EmployeeType employeeType;
}
