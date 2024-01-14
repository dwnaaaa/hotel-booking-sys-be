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
    public int getPriceByServiceCode(int serviceCode) {
        return serviceRepository.getPriceByServiceCode(serviceCode);
    }

    @Override
    public List<mp.hbsapi.entity.Service> getServicesByType(char employeeType) {
            return serviceRepository.findByEmployeeType(employeeType);
    }


}
