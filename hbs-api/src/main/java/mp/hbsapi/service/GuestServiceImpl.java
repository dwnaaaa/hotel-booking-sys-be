package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Guest;
import mp.hbsapi.entity.request.AddGuestRequest;
import mp.hbsapi.repository.GuestRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GuestServiceImpl implements GuestService {

    private final GuestRepository guestRepository;

    @Override
    public Guest addGuest(AddGuestRequest guestToAdd) {
        return guestRepository.save(guestToAdd.mapToGuest());
    }
}
