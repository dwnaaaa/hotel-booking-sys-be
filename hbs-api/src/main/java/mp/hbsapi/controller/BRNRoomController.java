package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.BRNRoom;
import mp.hbsapi.service.BRNRoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/brn-room")
public class BRNRoomController {

    private final BRNRoomService brnRoomService;

    @PostMapping("/add")
    public ResponseEntity<BRNRoom> addBRNGuest(@RequestBody BRNRoom brnRoomToAdd) {
        return new ResponseEntity<>(brnRoomService.addBRNRoom(brnRoomToAdd), HttpStatus.OK);
    }
}
