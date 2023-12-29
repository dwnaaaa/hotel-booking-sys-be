package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.repository.ServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ServicesServiceImpl implements ServicesService{

    private final ServiceRepository serviceRepository;

    @Override
    public List<mp.hbsapi.entity.Service> getServicesByEmployeeType(char employeeType) {
        return serviceRepository.getServicesByEmployeeTypeEquals(employeeType);
    }
}
