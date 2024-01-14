package mp.hbsapi.service;

import mp.hbsapi.entity.Guest;
import mp.hbsapi.entity.request.AddGuestRequest;
import mp.hbsapi.entity.request.GetGuestIdRequest;
import mp.hbsapi.entity.request.GetGuestNameResponse;

import java.util.List;

public interface GuestService {
    List<Guest> getAllGuests();

    Guest addGuest(AddGuestRequest guestToAdd);

    void addAllGuests(List<AddGuestRequest> guestsToAdd);

    long getGuestIdByName(GetGuestIdRequest request);

    Guest getGuestById(long id);
}
