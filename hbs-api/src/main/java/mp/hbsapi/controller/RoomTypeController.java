package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Room;
import mp.hbsapi.entity.RoomType;
import mp.hbsapi.service.RoomTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/room-type")
public class RoomTypeController {

    private final RoomTypeService roomTypeService;

    @GetMapping(path = "/all")
    public ResponseEntity<List<RoomType>> getAllRooms() {
        return new ResponseEntity<>(roomTypeService.getAllRoomTypes(), HttpStatus.OK);
    }

    @GetMapping(path = "/get-room-cost/{roomType}")
    public ResponseEntity<Integer> getRoomPrice(@PathVariable char roomType) {
        int roomCost = roomTypeService.getRoomPrice(roomType);
        return new ResponseEntity<>(roomCost, HttpStatus.OK);
    }

}
