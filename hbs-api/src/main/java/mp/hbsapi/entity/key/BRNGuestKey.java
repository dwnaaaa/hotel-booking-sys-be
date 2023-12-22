package mp.hbsapi.entity.key;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Embeddable
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BRNGuestKey implements Serializable {
    private long BRN;
    private long guestId;
}
