package mp.hbsapi.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import mp.hbsapi.entity.BillPayment;

@AllArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
public class AddBillPaymentRequest {
    @JsonProperty("brn")
    private String brn;
    @JsonProperty("total")
    private int total;
    @JsonProperty("payment_method")
    private char paymentMethod = 'N';
    @JsonProperty("card_id")
    private long cardId;

    public BillPayment mapToBillPayment() {
        return new BillPayment(this.brn, this.total, this.paymentMethod, this.cardId);
    }
}
