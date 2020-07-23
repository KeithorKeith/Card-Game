import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private SuitType suits;
    private RankType ranks;

    @Before
    public void before(){
        this.deck = new Deck();
    }

    @Test
    public void deckStartsEmpty(){
        assertEquals(0, deck.checkAmount());
    }

    @Test
    public void deckCanBeFilled(){
        deck.makeDeckOfCards(suits, ranks);
        assertEquals(52, deck.checkAmount());
    }

    @Test
    public void deckCanBeShuffled(){
        deck.makeDeckOfCards(suits, ranks);
        System.out.println(this.deck.getDeck());
//        assertEquals(this.deck, deck.shuffleDeck());
        deck.shuffleDeck();
        System.out.println(this.deck.getDeck());
    }



}
