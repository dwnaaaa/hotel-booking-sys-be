package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRN;
import mp.hbsapi.entity.request.AddBookingRequest;
import mp.hbsapi.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/booking")
public class BookingController {

    private final BookingService bookingService;

    @GetMapping("/all")
    public ResponseEntity<List<BRN>> getAllBookings() {
        return new ResponseEntity<>(bookingService.getAllBookings(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<BRN> addBooking(@RequestBody AddBookingRequest bookingToAdd) {
        return new ResponseEntity<>(bookingService.addBooking(bookingToAdd), HttpStatus.CREATED);
    }
}
