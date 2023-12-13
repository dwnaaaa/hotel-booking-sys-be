package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "EMPLOYEE")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Employee {
    @Id
    private long employeeId;
    private String firstName;
    private String middleName;
    private String lastName;
    private char employeeType;
}
