package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Guest;
import mp.hbsapi.entity.request.AddGuestRequest;
import mp.hbsapi.entity.request.GetGuestIdRequest;
import mp.hbsapi.repository.GuestRepository;
import org.springframework.dao.InvalidDataAccessResourceUsageException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GuestServiceImpl implements GuestService {

    private final GuestRepository guestRepository;

    @Override
    public List<Guest> getAllGuests() {
        return guestRepository.getAllGuests();
    }

    @Override
    public Guest addGuest(AddGuestRequest guestToAdd) {
        Guest guest = new Guest(guestToAdd.getFirstName(), guestToAdd.getMiddleName(),
                guestToAdd.getLastName(), guestToAdd.getBirthday(), guestToAdd.getStreet(), guestToAdd.getCity(),
                guestToAdd.getState(), guestToAdd.getZipCode(), guestToAdd.getContactNo(), guestToAdd.getEmailAdd());
        try {
            return guestRepository.addGuest(guestToAdd.getFirstName(), guestToAdd.getMiddleName(),
                    guestToAdd.getLastName(), guestToAdd.getBirthday(), guestToAdd.getStreet(), guestToAdd.getCity(),
                    guestToAdd.getState(), guestToAdd.getZipCode(), guestToAdd.getContactNo(), guestToAdd.getEmailAdd());
        } catch(InvalidDataAccessResourceUsageException e) {
            e.printStackTrace();
            return guest;
        }
    }

    @Override
    public void addAllGuests(List<AddGuestRequest> guestsToAdd) {
        for (AddGuestRequest guestToAdd : guestsToAdd) {
            addGuest(guestToAdd);
        }
    }

    @Override
    public long getGuestIdByName(GetGuestIdRequest request) {
        return guestRepository.getGuestIdByName(request.getFirstName(), request.getMiddleName(), request.getLastName());
    }
}
