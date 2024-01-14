package mp.hbsapi.service;

import mp.hbsapi.entity.Service;

import java.util.List;

public interface ServicesService {

    int getPriceByServiceCode(int serviceCode);

    List<Service> getServicesByType(char employeeType);
}
