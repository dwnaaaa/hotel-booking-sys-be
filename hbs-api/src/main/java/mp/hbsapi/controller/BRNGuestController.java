package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRNGuest;
import mp.hbsapi.service.BRNGuestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/brn-guest")
public class BRNGuestController {

    private final BRNGuestService brnGuestService;

    @PostMapping("/add")
    public ResponseEntity<BRNGuest> addBRNGuest(@RequestBody BRNGuest brnGuestToAdd) {
        return new ResponseEntity<>(brnGuestService.addBRNGuest(brnGuestToAdd), HttpStatus.OK);
    }
}
