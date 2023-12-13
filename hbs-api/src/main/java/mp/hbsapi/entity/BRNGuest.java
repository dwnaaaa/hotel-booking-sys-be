package mp.hbsapi.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import mp.hbsapi.entity.key.BRNGuestKey;

@Entity(name = "BRN_GUESTS")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BRNGuest {
    @EmbeddedId
    private BRNGuestKey id;
}
