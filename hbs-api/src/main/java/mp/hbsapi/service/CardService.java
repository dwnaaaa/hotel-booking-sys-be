package mp.hbsapi.service;

import mp.hbsapi.entity.Card;
import mp.hbsapi.entity.request.AddCardRequest;

import java.util.List;

public interface CardService {
    List<Card> getAllCards();

    Card addCard(AddCardRequest cardToAdd);
}
