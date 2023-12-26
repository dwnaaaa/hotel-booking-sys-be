package mp.hbsapi.service;

import mp.hbsapi.entity.Guest;
import mp.hbsapi.entity.request.AddGuestRequest;

public interface GuestService {
    Guest addGuest(AddGuestRequest guestToAdd);
}
