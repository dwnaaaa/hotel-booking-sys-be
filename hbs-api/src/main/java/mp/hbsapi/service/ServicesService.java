package mp.hbsapi.service;

import mp.hbsapi.entity.Service;

import java.util.List;

public interface ServicesService {
    List<Service> getServicesByEmployeeType(char employeeType);

    int getPriceByServiceCode(int serviceCode);
}
