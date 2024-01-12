package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRNService;
import mp.hbsapi.entity.key.BRNServiceKey;
import mp.hbsapi.service.BRNServiceService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/brn-service")
public class BRNServiceController {

    private final BRNServiceService brnServiceService;

    @GetMapping("/all")
    public ResponseEntity<List<BRNService>> getAllServices(){
        return new ResponseEntity<>(brnServiceService.getAllServices(), HttpStatus.OK);
    }

    @GetMapping("/by-brn/{brn}/{serviceCode}")
    public ResponseEntity<List<BRNService>> getServicesByBRN(@PathVariable String brn, @PathVariable int serviceCode) {
        List<BRNService> services = brnServiceService.getServicesByBRN(brn, serviceCode);
        return new ResponseEntity<>(services, HttpStatus.OK);
    }

    @GetMapping("/{serviceCode}/price")
    public ResponseEntity<Double> getPriceByServiceCode(@PathVariable int serviceCode) {
        Double price = brnServiceService.getPriceByServiceCode(serviceCode);
        if (price != null) {
            return new ResponseEntity<>(price, HttpStatus.OK);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //get total cost sdjhfgdsjk
//    @GetMapping("/totalPrice")
//    public ResponseEntity<Double> getTotalPrice(
//
//    )

    @PostMapping("/addService")
    public ResponseEntity<BRNService> addBRNService(@RequestParam String brn,
                                                    @RequestParam int serviceCode,
                                                    @RequestParam int roomNumber,
                                                    @RequestParam int quantity) {
        return new ResponseEntity<>(brnServiceService.addBRNService(brn, serviceCode, roomNumber, quantity), HttpStatus.CREATED);
    }

    //Add record in BRN_SERVICES for snacks taken from room bar w/ room number (POST)
    @PostMapping("/addSnacks")
    public ResponseEntity<String> addSnackRecord(@RequestParam String brn,
                                                 @RequestParam int serviceCode,
                                                 @RequestParam int roomNumber,
                                                 @RequestParam int quantity) {
        brnServiceService.addSnackRecord(brn, serviceCode, roomNumber, quantity);
        return new ResponseEntity<>("Snack record added successfully", HttpStatus.CREATED);
    }

    //Add record in BRN_SERVICES for cleaning service w/ room number (POST)
    @PostMapping("/addCleaning")
    public ResponseEntity<String> addCleaningRecord(@RequestParam String brn,
                                                 @RequestParam int serviceCode,
                                                 @RequestParam int roomNumber,
                                                    @RequestParam int quantity) {
        brnServiceService.addCleaningRecord(brn, serviceCode, roomNumber, quantity);
        return new ResponseEntity<>("Cleaning record added successfully", HttpStatus.CREATED);
    }

    //Add record in BRN_SERVICES for damages w/ room number (POST)
    @PostMapping("/addDamage")
    public ResponseEntity<String> addDamageRecord(@RequestParam String brn,
                                                    @RequestParam int serviceCode,
                                                    @RequestParam int roomNumber,
                                                  @RequestParam int quantity) {
        brnServiceService.addDamageRecord(brn, serviceCode, roomNumber, quantity);
        return new ResponseEntity<>("Damage record added successfully", HttpStatus.CREATED);
    }



}
