package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRNService;
import mp.hbsapi.entity.key.BRNServiceKey;
import mp.hbsapi.repository.BRNServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BRNServiceImpl implements BRNServiceService {

    private final BRNServiceRepository brnServiceRepository;

    @Override
    public List<BRNService> getAllServices() { return brnServiceRepository.findAll(); }

    @Override
    public void addSnackRecord(String brn, int serviceCode, int roomNumber) {
        BRNServiceKey id = new BRNServiceKey(brn, serviceCode);
        BRNService brnService = new BRNService(id, roomNumber);
        brnServiceRepository.save(brnService);
    }

    @Override
    public void addCleaningRecord(String brn, int serviceCode, int roomNumber){
        BRNServiceKey id = new BRNServiceKey(brn, serviceCode);
        BRNService brnService = new BRNService(id, roomNumber);
        brnServiceRepository.save(brnService);
    }

    @Override
    public void addDamageRecord(String brn, int serviceCode, int roomNumber){
        BRNServiceKey id = new BRNServiceKey(brn, serviceCode);
        BRNService brnService = new BRNService(id, roomNumber);
        brnServiceRepository.save(brnService);
    }

    @Override
    public BRNService addBRNService(String brn, int serviceCode, int roomNumber) {
        BRNServiceKey id = new BRNServiceKey(brn, serviceCode);
        BRNService brnService = new BRNService(id, roomNumber);
        return brnServiceRepository.save(brnService);
    }
}
