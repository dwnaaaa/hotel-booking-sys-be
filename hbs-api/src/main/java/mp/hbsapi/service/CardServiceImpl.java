package mp.hbsapi.service;

import mp.hbsapi.entity.Card;
import mp.hbsapi.entity.request.AddCardRequest;
import mp.hbsapi.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.InvalidDataAccessResourceUsageException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardServiceImpl implements CardService {
    private final CardRepository cardRepository;

    @Autowired
    public CardServiceImpl(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    @Override
    public List<Card> getAllCards() {
        return cardRepository.findAll();
    }

    @Override
    public Card addCard(AddCardRequest cardToAdd) {
//            return cardRepository.addCard(cardToAdd.getCardNumber(), cardToAdd.getCvv(), cardToAdd.getExpirationDate());
        Card card = new Card(cardToAdd.getCardNumber(), cardToAdd.getCvv(), cardToAdd.getExpirationDate());
        try {
            return cardRepository.addCard(cardToAdd.getCardNumber(), cardToAdd.getCvv(), cardToAdd.getExpirationDate());
        } catch (InvalidDataAccessResourceUsageException e) {
            e.printStackTrace();
            return card;
        }
    }

}
