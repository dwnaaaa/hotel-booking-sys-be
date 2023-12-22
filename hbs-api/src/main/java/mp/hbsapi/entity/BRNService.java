package mp.hbsapi.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import mp.hbsapi.entity.key.BRNServiceKey;

@Entity(name = "BRN_SERVICES")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BRNService {
    @EmbeddedId
    private BRNServiceKey id;
    private int roomNumber;
}
