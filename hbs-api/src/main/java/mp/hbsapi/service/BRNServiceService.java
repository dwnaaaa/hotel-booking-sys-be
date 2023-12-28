package mp.hbsapi.service;

import mp.hbsapi.entity.BRNService;

import java.util.List;

public interface BRNServiceService {

    List<BRNService> getAllServices();
    void addSnackRecord(String brn, int serviceCode, int roomNumber);

    void addCleaningRecord(String brn, int serviceCode, int roomNumber);

    void addDamageRecord(String brn, int serviceCode, int roomNumber);
}
