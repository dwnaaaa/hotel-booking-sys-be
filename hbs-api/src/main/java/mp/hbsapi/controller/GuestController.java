package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Guest;
import mp.hbsapi.entity.request.AddGuestRequest;
import mp.hbsapi.entity.request.GetGuestIdRequest;
import mp.hbsapi.service.GuestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/guest")
public class GuestController {

    private final GuestService guestService;

    @GetMapping("/all")
    public ResponseEntity<List<Guest>> getAllGuests() {
        return new ResponseEntity<>(guestService.getAllGuests(), HttpStatus.OK);
    }

//    @GetMapping("/{id}")
//    public ResponseEntity

    @PostMapping("/add")
    public ResponseEntity<Guest> addGuest(@RequestBody AddGuestRequest guestToAdd) {
        return new ResponseEntity<>(guestService.addGuest(guestToAdd), HttpStatus.OK);
    }

    @PostMapping("/add-many")
    public ResponseEntity<Void> addGuests(@RequestBody List<AddGuestRequest> guestsToAdd) {
        guestService.addAllGuests(guestsToAdd);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("/id")
    public ResponseEntity<Long> getGuestIdByName(@RequestBody GetGuestIdRequest request) {
        return new ResponseEntity<>(guestService.getGuestIdByName(request), HttpStatus.OK);
    }
}