package mp.hbsapi.repository;

import mp.hbsapi.entity.BRN;
import mp.hbsapi.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

public interface CardRepository extends JpaRepository<Card, String> {
//    @Procedure(name = "Card.addCard")
//    Card addCard(@Param("in_card_number") long cardNumber, @Param("in_cvv") int cvv,
//                   @Param("in_expiration_date") String expirationDate);

    @Query(value = "INSERT INTO CARD (CARD_NUMBER, CVV, EXPIRATION_DATE) VALUES (?1, ?2, TO_DATE(?3, 'YYYY-MM'))", nativeQuery = true)
    Card addCard(String cardNumber, String cvv, String expirationDate);
}
