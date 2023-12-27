package mp.hbsapi.service;

import mp.hbsapi.entity.BRNGuest;

import java.util.List;

public interface BRNGuestService {
    List<BRNGuest> getAllBRNGuests();

    BRNGuest addBRNGuest(BRNGuest brnGuest);
}
