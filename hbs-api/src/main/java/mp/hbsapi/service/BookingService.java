package mp.hbsapi.service;

import mp.hbsapi.entity.BRN;
import mp.hbsapi.entity.request.AddBookingRequest;

import java.util.List;

public interface BookingService {
    List<BRN> getAllBookings();
    BRN addBooking(AddBookingRequest bookingToAdd);

    BRN getBookingByBRN(String brn);

    void checkIn(String brn);

    void checkOut(String brn);
}
