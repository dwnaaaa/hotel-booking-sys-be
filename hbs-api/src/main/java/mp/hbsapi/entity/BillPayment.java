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
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_card_id", type = String.class),
})
public class BillPayment {
    @Id
    private String bpId;
    private String brn;
    private int total;
    private char paymentMethod;
    private String cardId;
}
