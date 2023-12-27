package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRNGuest;
import mp.hbsapi.repository.BRNGuestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BRNGuestServiceImpl implements BRNGuestService {

    private final BRNGuestRepository brnGuestRepository;

    @Override
    public List<BRNGuest> getAllBRNGuests() {
        return brnGuestRepository.findAll();
    }

    @Override
    public BRNGuest addBRNGuest(BRNGuest brnGuest) {
        return brnGuestRepository.save(brnGuest);
    }
}
