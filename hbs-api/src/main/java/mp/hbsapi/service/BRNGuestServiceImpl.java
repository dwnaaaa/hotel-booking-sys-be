package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRNGuest;
import mp.hbsapi.repository.BRNGuestRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BRNGuestServiceImpl implements BRNGuestService {

    private final BRNGuestRepository brnGuestRepository;

    @Override
    public BRNGuest addBRNGuest(BRNGuest brnGuest) {
        return brnGuestRepository.save(brnGuest);
    }
}
