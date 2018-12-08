package ana.com.poker;

public class Poker {
    Card[] cards = new Card[52];
    public Poker(){
        for(int i =0;i<cards.length;i++){
            cards[i] = new Card(i);
        }
    }
}
