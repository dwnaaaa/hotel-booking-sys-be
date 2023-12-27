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
        return bookingRepository.addBooking(bookingToAdd.getPrimaryGuestId(), bookingToAdd.getBookingDate(), bookingToAdd.getCheckInDate(),
                bookingToAdd.getCheckOutDate(), bookingToAdd.getRoomType(), bookingToAdd.getNoOfRooms());
    }
}
