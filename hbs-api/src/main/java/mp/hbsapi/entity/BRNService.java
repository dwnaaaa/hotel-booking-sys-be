package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "BRN_SERVICES")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BRNService {
    @Id
    private long brnServiceId;
    private long brnId;
    private int roomNumber;
    private long serviceId;
}
