package mp.hbsapi.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import mp.hbsapi.entity.key.RoomTypeServiceKey;

@Entity(name = "ROOM_TYPE_SERVICE")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class RoomTypeService {
    @EmbeddedId
    private RoomTypeServiceKey id;
}
