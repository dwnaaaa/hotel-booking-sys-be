package mp.hbsapi.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "EMPLOYEE")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(generator = "employee_seq")
    @SequenceGenerator(name = "employee_seq", sequenceName = "EMPLOYEE_SEQ", allocationSize = 1)
    private String employeeId;
    private String firstName;
    private String middleName;
    private String lastName;
    @OneToOne
    @JoinColumn(name = "EMPLOYEE_TYPE")
    private EmployeeType employeeType;
}
