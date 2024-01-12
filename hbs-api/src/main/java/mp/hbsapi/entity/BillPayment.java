package mp.hbsapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "BILL_PAYMENT")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@NamedStoredProcedureQuery(name = "BillPayment.addBillPayment", procedureName = "ADD_BILL_PAYMENT", parameters =  {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_brn", type = String.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_total", type = Integer.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_payment_method", type = Character.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_card_id", type = Long.class),
})
public class BillPayment {
    @Id
    @GeneratedValue(generator = "bp_seq")
    @SequenceGenerator(name = "bp_seq", sequenceName = "BP_SEQ", allocationSize = 1)
    private long bpId;
    private String brn;
    private int total;
    private char paymentMethod;
    private long cardId;

    public BillPayment(String brn, int total, char paymentMethod, long cardId) {
        this.brn = brn;
        this.total = total;
        this.paymentMethod = paymentMethod;
        this.cardId = cardId;
    }
}
