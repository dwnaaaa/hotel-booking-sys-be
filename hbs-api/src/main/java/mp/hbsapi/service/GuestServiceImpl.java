package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Guest;
import mp.hbsapi.entity.request.AddGuestRequest;
import mp.hbsapi.repository.GuestRepository;
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
        return guestRepository.addGuest(guestToAdd.getFirstName(), guestToAdd.getMiddleName(), guestToAdd.getLastName(),
                guestToAdd.getBirthday(), guestToAdd.getStreet(), guestToAdd.getCity(), guestToAdd.getState(),
                guestToAdd.getZipCode(), guestToAdd.getContactNo(), guestToAdd.getEmailAdd());
    }
}
