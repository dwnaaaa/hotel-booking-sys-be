package mp.hbsapi.service;

import mp.hbsapi.entity.BRNService;

import java.util.List;

public interface BRNServiceService {

    List<BRNService> getAllServices();
    void addSnackRecord(String brn, int serviceCode, int roomNumber, int quantity);

    void addCleaningRecord(String brn, int serviceCode, int roomNumber, int quantity);

    void addDamageRecord(String brn, int serviceCode, int roomNumber, int quantity);

    BRNService addBRNService(String brn, int serviceCode, int roomNumber, int quantity);

    List<BRNService> getServicesByBRN(String brn, int serviceCode);

    //Double getPriceByServiceCode(int serviceCode);

    Double getTotalPriceByBRN(String brn);

    List<BRNService> getServicesByRoomNumber(int roomNumber);

    public List<String> getBRNsByBRNService(String brn);

    Integer findRoomNumber(String brn, Integer serviceCode);


}
