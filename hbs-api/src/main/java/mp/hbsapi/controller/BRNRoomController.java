package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRNRoom;
import mp.hbsapi.entity.key.BRNRoomKey;
import mp.hbsapi.service.BRNRoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/brn-room")
public class BRNRoomController {

    private final BRNRoomService brnRoomService;

    @GetMapping("/all")
    public ResponseEntity<List<BRNRoom>> getAllBRNRooms() {
        return new ResponseEntity<>(brnRoomService.getAllBRNRooms(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<BRNRoom> addBRNRoom(@RequestBody BRNRoomKey brnRoomToAdd) {
        return new ResponseEntity<>(brnRoomService.addBRNRoom(new BRNRoom(brnRoomToAdd)), HttpStatus.CREATED);
    }

    @GetMapping("/room-number/{brn}")
    public ResponseEntity<Integer> getRoomNumberByBrn(@PathVariable String brn) {
        Integer roomNumber = brnRoomService.findRoomNumberByBrn(brn);
        if (roomNumber != null) {
            return ResponseEntity.ok(roomNumber);
        } else {
            return ResponseEntity.notFound().build();
        }
    }


}
