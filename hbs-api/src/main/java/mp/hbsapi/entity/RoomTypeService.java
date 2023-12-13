package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "ROOM_TYPE_SERVICE")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RoomTypeService {
    @Id
    private String serviceName;
    private char roomType;
    private int price;
}
