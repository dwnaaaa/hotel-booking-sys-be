package mp.hbsapi.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import mp.hbsapi.entity.key.BRNRoomKey;

@Entity(name = "BRN_ROOMS")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BRNRoom {
    @EmbeddedId
    private BRNRoomKey id;
}
