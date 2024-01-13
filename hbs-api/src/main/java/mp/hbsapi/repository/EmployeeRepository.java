package mp.hbsapi.repository;

import mp.hbsapi.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface    EmployeeRepository extends JpaRepository<Employee,Long> {

    @Query(value = "SELECT E.*, ET.EMPLOYEE_TYPE_NAME, E.SALARY AS EMPLOYEE_SALARY " +
            "FROM EMPLOYEE E LEFT JOIN EMPLOYEE_TYPE ET ON E.EMPLOYEE_TYPE = ET.EMPLOYEE_TYPE", nativeQuery = true)
    List<Employee> getAllEmployeesWithType();

    @Query(value = "SELECT EMPLOYEE_TYPE FROM EMPLOYEE E LEFT JOIN USERS U ON E.EMPLOYEE_ID = U.EMPLOYEE_ID\n" +
            "WHERE U.USERNAME = ?1", nativeQuery = true)
    Character getEmployeeTypeByUsername(String id);

    @Modifying
    @Transactional
    @Query(value = "UPDATE EMPLOYEE SET SALARY = :salary WHERE EMPLOYEE_ID = :employeeId", nativeQuery = true)
    void updateSalary(int employeeId, double salary);
}
