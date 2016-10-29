package Task2_Deck;

import Task1_Cards.CardRank;
import Task1_Cards.CardSuit;

public class Card implements Comparable<Card> {

    @Override
    public String toString() {

        String ranks = null;
        String str = null;
        int i = 0;

        for (CardSuit suit : CardSuit.values()) {
            str = str + (suit + " ");
            i++;
        }
        String[] split = str.split(" ");
        str = null;
                
        for (int n = i; n > 0; n--) {            
            
            for (CardRank rank : CardRank.values()) {
                str = str + rank;
                i++;
            }
            ranks +=str;
        }
        return ranks;
    }

    @Override
    public int compareTo(Card t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
