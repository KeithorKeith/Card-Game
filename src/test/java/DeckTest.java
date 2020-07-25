import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeckTest {

    private Deck deck;
    private SuitType suits;
    private RankType ranks;
    private Player dealer;
    private Player player2;

    @Before
    public void before(){
        this.deck = new Deck();
        this.dealer = new Player();
        this.player2 = new Player();
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
        deck.shuffleDeck();
        System.out.println(this.deck.getDeck());
    }

    @Test
    public void deckCanBeDealtToHand(){
        deck.makeDeckOfCards(suits, ranks);
        deck.shuffleDeck();
        deck.dealCard(dealer);
        assertEquals(51, deck.checkAmount());
        assertEquals(1, dealer.checkHand());
    }

    @Test
    public void canHaveWinner(){
        deck.makeDeckOfCards(suits, ranks);
        deck.dealCard(dealer);
        deck.dealCard(player2);
        deck.dealCard(dealer);
        deck.dealCard(player2);
        assertEquals(player2, deck.compareCard(dealer, player2));
    }
}
