package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "EMPLOYEE_TYPE")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmployeeType {
    @Id
    private char employeeType;
    private String typeName;
}
