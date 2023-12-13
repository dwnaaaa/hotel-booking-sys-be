package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "BILL_PAYMENT")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BillPayment {
    @Id
    private long bpId;
    private int total;
    private char paymentMethod;
    private long cardId;
}
