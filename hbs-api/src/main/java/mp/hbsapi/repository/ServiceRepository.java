package mp.hbsapi.repository;

import mp.hbsapi.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {
    public List<Service> getServicesByEmployeeTypeEquals(char employeeType);

    @Query(value = "SELECT PRICE FROM SERVICES WHERE SERVICE_CODE = :serviceCode", nativeQuery = true)
    int getPriceByServiceCode(int serviceCode);

    @Query(value = "SELECT SERVICE_NAME FROM SERVICES WHERE EMPLOYEE_TYPE = :employeeType", nativeQuery = true)
    List<Service> findByType(String employeeType);
}
