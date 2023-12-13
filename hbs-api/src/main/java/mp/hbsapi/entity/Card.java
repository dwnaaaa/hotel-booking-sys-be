package mp.hbsapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "CARD")
@RequiredArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Card {
    @Id
    private long cardId;
    private long cardNumber;
    private int cvv;
    private String expirationDate;
}
