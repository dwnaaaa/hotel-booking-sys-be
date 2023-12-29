package mp.hbsapi.repository;

import mp.hbsapi.entity.Service;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServiceRepository extends JpaRepository<Service, Integer> {
    public List<Service> getServicesByEmployeeTypeEquals(char employeeType);
}
