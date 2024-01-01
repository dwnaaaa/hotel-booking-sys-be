package mp.hbsapi.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "CARD")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@NamedStoredProcedureQuery(name = "Card.addCard", procedureName = "ADD_CARD", parameters =  {
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_card_number", type = long.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_cvv", type = int.class),
        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_expiration_date", type = String.class)
})
public class Card {
    @Id
    private String cardId;
    private long cardNumber;
    private int cvv;
    private String expirationDate;
}
