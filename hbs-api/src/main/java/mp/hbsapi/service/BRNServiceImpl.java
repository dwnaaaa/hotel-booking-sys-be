package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRNService;
import mp.hbsapi.entity.key.BRNServiceKey;
import mp.hbsapi.repository.BRNServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BRNServiceImpl implements BRNServiceService {

    @Autowired
    private final BRNServiceRepository brnServiceRepository;

    @Override
    public List<BRNService> getAllServices() { return brnServiceRepository.findAll(); }

    @Override
    public void addSnackRecord(String brn, int serviceCode, int roomNumber, int quantity) {
        BRNServiceKey id = new BRNServiceKey(brn, serviceCode);
        BRNService brnService = new BRNService(id, roomNumber, quantity);
        brnServiceRepository.save(brnService);
    }

    @Override
    public void addCleaningRecord(String brn, int serviceCode, int roomNumber, int quantity){
        BRNServiceKey id = new BRNServiceKey(brn, serviceCode);
        BRNService brnService = new BRNService(id, roomNumber, quantity);
        brnServiceRepository.save(brnService);
    }

    @Override
    public void addDamageRecord(String brn, int serviceCode, int roomNumber, int quantity){
        BRNServiceKey id = new BRNServiceKey(brn, serviceCode);
        BRNService brnService = new BRNService(id, roomNumber, quantity);
        brnServiceRepository.save(brnService);
    }

    @Override
    public BRNService addBRNService(String brn, int serviceCode, int roomNumber, int quantity) {
        BRNServiceKey id = new BRNServiceKey(brn, serviceCode);
        BRNService brnService = new BRNService(id, roomNumber, quantity);
        return brnServiceRepository.save(brnService);
    }

    @Override
    public List<BRNService> getServicesByBRN(String brn, int serviceCode) {
        BRNServiceKey id = new BRNServiceKey(brn, serviceCode);
        return brnServiceRepository.findAllById(id);
    }

    @Override
    public Double getPriceByServiceCode(int serviceCode) {
        BRNServiceKey id = new BRNServiceKey(null, serviceCode); // Assuming BRN is not needed for this query
        BRNService service = brnServiceRepository.findById(id).orElse(null);
        return (service != null) ? service.getPrice() : null;
    }

    @Override
    public Double getTotalPriceByBRN(String brn) {
        List<BRNService> services = brnServiceRepository.findByIdBrn(brn);
        if (services != null && !services.isEmpty()) {
            double totalPrice = services.stream().mapToDouble(BRNService::getPrice).sum();
            return totalPrice;
        }
        return null;
    }
}
