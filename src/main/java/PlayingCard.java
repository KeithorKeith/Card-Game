public class PlayingCard {

    private SuitType suit;
    private RankType rank;

    public PlayingCard(SuitType suit, RankType rank){
        this.suit = suit;
        this.rank = rank;
    }

    public SuitType getSuit(){
        return this.suit;
    }

    public RankType getRank(){
        return this.rank;
    }

    public int getValueFromRankEnum(){
        return this.rank.getRankType();
    }

    public void printSuitAvailable(){
        SuitType[] suits = SuitType.values();
        System.out.println(suits [0]);
    }

}
