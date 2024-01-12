package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Room;
import mp.hbsapi.entity.RoomType;
import mp.hbsapi.service.RoomTypeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
