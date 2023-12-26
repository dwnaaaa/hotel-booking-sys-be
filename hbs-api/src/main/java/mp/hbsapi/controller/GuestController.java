package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Guest;
import mp.hbsapi.entity.request.AddGuestRequest;
import mp.hbsapi.service.GuestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/guest")
public class GuestController {

    private final GuestService guestService;

    @PostMapping("/add")
    public ResponseEntity<Guest> addGuest(@RequestBody AddGuestRequest guestToAdd) {
        return new ResponseEntity<>(guestService.addGuest(guestToAdd), HttpStatus.OK);
    }
}
