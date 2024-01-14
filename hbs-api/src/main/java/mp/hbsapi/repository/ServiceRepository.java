package mp.hbsapi.repository;

import mp.hbsapi.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {

    @Query(value = "SELECT PRICE FROM SERVICES WHERE SERVICE_CODE = :serviceCode", nativeQuery = true)
    int getPriceByServiceCode(int serviceCode);

    List<Service> findByEmployeeType(char type);
}
