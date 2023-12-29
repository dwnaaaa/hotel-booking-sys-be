package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRNService;
import mp.hbsapi.service.BRNServiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/service")
public class BRNServiceController {

    private final BRNServiceService brnServiceService;

    @GetMapping("/all")
    public ResponseEntity<List<BRNService>> getAllServices(){
        return new ResponseEntity<>(brnServiceService.getAllServices(), HttpStatus.OK);
    }

    //Add record in BRN_SERVICES for snacks taken from room bar w/ room number (POST)
    @PostMapping("/addSnacks")
    public ResponseEntity<String> addSnackRecord(@RequestParam String brn,
                                                 @RequestParam int serviceCode,
                                                 @RequestParam int roomNumber) {
        brnServiceService.addSnackRecord(brn, serviceCode, roomNumber);
        return new ResponseEntity<>("Snack record added successfully", HttpStatus.CREATED);
    }

    //Add record in BRN_SERVICES for cleaning service w/ room number (POST)
    @PostMapping("/addCleaning")
    public ResponseEntity<String> addCleaningRecord(@RequestParam String brn,
                                                 @RequestParam int serviceCode,
                                                 @RequestParam int roomNumber) {
        brnServiceService.addCleaningRecord(brn, serviceCode, roomNumber);
        return new ResponseEntity<>("Cleaning record added successfully", HttpStatus.CREATED);
    }

    //Add record in BRN_SERVICES for damages w/ room number (POST)
    @PostMapping("/addDamage")
    public ResponseEntity<String> addDamageRecord(@RequestParam String brn,
                                                    @RequestParam int serviceCode,
                                                    @RequestParam int roomNumber) {
        brnServiceService.addDamageRecord(brn, serviceCode, roomNumber);
        return new ResponseEntity<>("Damage record added successfully", HttpStatus.CREATED);
    }
}
