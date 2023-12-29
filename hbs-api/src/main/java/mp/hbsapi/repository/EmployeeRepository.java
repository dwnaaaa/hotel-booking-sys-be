package mp.hbsapi.repository;

import mp.hbsapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee,String> {

    @Query(value = "SELECT E.*, ET.EMPLOYEE_TYPE_NAME, ET.SALARY " +
            "FROM EMPLOYEE E LEFT JOIN EMPLOYEE_TYPE ET ON E.EMPLOYEE_TYPE = ET.EMPLOYEE_TYPE", nativeQuery = true)
    List<Employee> getAllEmployeesWithType();
}
