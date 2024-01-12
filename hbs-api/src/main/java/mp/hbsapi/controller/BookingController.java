package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRN;
import mp.hbsapi.entity.request.AddBookingRequest;
import mp.hbsapi.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/booking")
public class BookingController {

    private final BookingService bookingService;

    @GetMapping(path = "/all")
    public ResponseEntity<List<BRN>> getAllBookings() {
        return new ResponseEntity<>(bookingService.getAllBookings(), HttpStatus.OK);
    }

    @PostMapping(path = "/add")
    public ResponseEntity<BRN> addBooking(@RequestBody AddBookingRequest bookingToAdd) {
        return new ResponseEntity<>(bookingService.addBooking(bookingToAdd), HttpStatus.CREATED);
    }

    @GetMapping(path = "/lastbrn")
    public ResponseEntity<BRN> getLastBooking() {
        List<BRN> allBookings = bookingService.getAllBookings();

        BRN lastBooking = allBookings.get(allBookings.size() - 1);

        return new ResponseEntity<>(lastBooking, HttpStatus.OK);
    }
}
