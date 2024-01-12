package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Room;
import mp.hbsapi.service.RoomService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequiredArgsConstructor
@RequestMapping("/room")
public class RoomController {

    private final RoomService roomService;

    @GetMapping(path = "/all")
    public ResponseEntity<List<Room>>  getAllRooms() {
        return new ResponseEntity<>(roomService.getAllRooms(), HttpStatus.OK);
    }

    @GetMapping(path = "/count-with-type/{type}")
    public ResponseEntity<Integer>  getAllRooms(@PathVariable char type) {
        return new ResponseEntity<>(roomService.getRoomCountByType(type), HttpStatus.OK);
    }

    @GetMapping(path = "/available-rooms-by-type/{type}")
    public ResponseEntity<List<Integer>> getAvailableRoomsByType(@PathVariable char type) {
        return new ResponseEntity<>(roomService.getAvailableRoomsByType(type), HttpStatus.OK);
    }
}
