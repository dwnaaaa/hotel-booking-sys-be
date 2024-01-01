package mp.hbsapi.entity.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
@Setter
public class AddCardRequest {
//    @JsonProperty("card_id")
//    private String cardId;
    @JsonProperty("card_number")
    private long cardNumber;
    @JsonProperty("cvv")
    private int cvv;
    @JsonProperty("expiration_date")
    private String expirationDate;
}
