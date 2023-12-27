package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRNGuest;
import mp.hbsapi.entity.key.BRNGuestKey;
import mp.hbsapi.service.BRNGuestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/brn-guest")
public class BRNGuestController {

    private final BRNGuestService brnGuestService;

    @GetMapping("/all")
    public ResponseEntity<List<BRNGuest>> getAllBRNGuests() {
        return new ResponseEntity<>(brnGuestService.getAllBRNGuests(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<BRNGuest> addBRNGuest(@RequestBody BRNGuestKey brnGuestToAdd) {
        return new ResponseEntity<>(brnGuestService.addBRNGuest(new BRNGuest(brnGuestToAdd)), HttpStatus.CREATED);
    }
}
