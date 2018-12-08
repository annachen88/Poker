package ana.com.poker;

public class Card {
    int value;
    char[] flower = {'c','d','h','s'};
    public Card(int value){
        this.value=value;
    }
    public String get(){
        return (value%13+1)+""+flower[value/13];
    }
}
