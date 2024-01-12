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
//@NamedStoredProcedureQuery(name = "Card.addCard", procedureName = "ADD_CARD", parameters =  {
//        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_card_number", type = long.class),
//        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_cvv", type = int.class),
//        @StoredProcedureParameter(mode = ParameterMode.IN, name = "in_expiration_date", type = String.class)
//})
public class Card {
    @Id
    @GeneratedValue(generator = "card_seq")
    @SequenceGenerator(name = "card_seq", sequenceName = "CARD_SEQ", allocationSize = 1)
    private long cardId;
    private String cardNumber;
    private String cvv;
    private String expirationDate;

    public Card(String cardNumber, String cvv, String expirationDate) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expirationDate = expirationDate;
    }
}
