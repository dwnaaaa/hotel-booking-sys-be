package mp.hbsapi.service;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRN;
import mp.hbsapi.entity.request.AddBookingRequest;
import mp.hbsapi.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingServiceImpl implements BookingService {

    private final BookingRepository bookingRepository;

    @Override
    public List<BRN> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public BRN addBooking(AddBookingRequest bookingToAdd) {
        // Implement logic to add a new booking to the repository
        return bookingRepository.save(bookingToAdd.mapToBRN());
    }
}
