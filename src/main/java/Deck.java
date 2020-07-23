import java.util.ArrayList;

public class Deck {

    private ArrayList<PlayingCard> deckOfCards;


    public Deck() {
        this.deckOfCards = new ArrayList<PlayingCard>();
    }

    public void makeDeckOfCards(SuitType suit, RankType rank) {
        for (SuitType suitName : suit.values()) {
            for (RankType rankNumber : rank.values()) {
                PlayingCard card = new PlayingCard(suitName, rankNumber);
                this.deckOfCards.add(card);
            }
        }
    }

    public int checkAmount(){
        return this.deckOfCards.size();
    }

}
