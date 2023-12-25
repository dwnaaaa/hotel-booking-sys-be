package mp.hbsapi.controller;

import mp.hbsapi.entity.BRN;
import mp.hbsapi.entity.BillPayment;
import mp.hbsapi.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/confirmed")
    public ResponseEntity<List<BRN>> getAllConfirmedBookings() {
        List<BRN> confirmedBookings = bookingService.getAllConfirmedBookings();
        return new ResponseEntity<>(confirmedBookings, HttpStatus.OK);
    }

    @PostMapping("/new")
    public ResponseEntity<BRN> addNewBooking(@RequestBody BRN newBooking) {
        BRN addedBooking = bookingService.addNewBooking(newBooking);
        return new ResponseEntity<>(addedBooking, HttpStatus.CREATED);
    }

    @GetMapping("/{brn}/bill-payment")
    public ResponseEntity<BillPayment> getBillPayment(@PathVariable String brn) {
        BillPayment billPayment = bookingService.getBillPayment(brn);
        return new ResponseEntity<>(billPayment, HttpStatus.OK);
    }
}
