package mp.hbsapi.service;

import mp.hbsapi.entity.BRN;
import mp.hbsapi.entity.BillPayment;
import mp.hbsapi.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public List<BRN> getAllConfirmedBookings() {
        return bookingRepository.findAllConfirmedBookings();
    }

    public BRN addNewBooking(BRN newBooking) {
        // Implement logic to add a new booking to the repository
        return bookingRepository.save(newBooking);
    }

    public BillPayment getBillPayment(String brn) {
        return bookingRepository.findBillPaymentByBrn(brn);
    }
}
