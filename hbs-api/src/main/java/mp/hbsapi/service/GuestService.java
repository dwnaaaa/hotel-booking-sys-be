package mp.hbsapi.service;

import mp.hbsapi.entity.Guest;
import mp.hbsapi.entity.request.AddGuestRequest;

import java.util.List;

public interface GuestService {
    List<Guest> getAllGuests();

    Guest addGuest(AddGuestRequest guestToAdd);
}
