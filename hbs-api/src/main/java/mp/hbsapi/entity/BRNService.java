package mp.hbsapi.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;
import mp.hbsapi.entity.key.BRNServiceKey;

@Entity
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "BRN_SERVICES")
public class BRNService {
    @EmbeddedId
    private BRNServiceKey id;
    private int roomNumber;
    private double price;
    private int quantity;

    public BRNService(BRNServiceKey id, int roomNumber, int quantity) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.quantity = quantity;
    }
}
