package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity(name = "EMPLOYEE_TYPE")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeType {
    @Id
    private char employeeType;
    private String employeeTypeName;
    private int salary;
}
