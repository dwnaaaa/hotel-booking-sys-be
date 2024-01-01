package mp.hbsapi.controller;

import lombok.RequiredArgsConstructor;
import mp.hbsapi.entity.Card;
import mp.hbsapi.entity.request.AddCardRequest;
import mp.hbsapi.service.CardService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cards")
public class CardController {

    private final CardService cardService;

    @GetMapping("/all")
    public ResponseEntity<List<Card>> getAllCards() {
        return new ResponseEntity<>(cardService.getAllCards(), HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Card> addCard(@RequestBody AddCardRequest cardToAdd) {
        return new ResponseEntity<>(cardService.addCard(cardToAdd), HttpStatus.CREATED);
    }
}
