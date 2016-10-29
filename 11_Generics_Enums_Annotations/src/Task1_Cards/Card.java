package Task1_Cards;

public class Card {
    
    public static void main(String[] args) {
        
        int i = 1;
        
        for(CardSuit suit : CardSuit.values()){
            if(CardRank.values().length == i) {
                System.out.print(suit);
                System.out.println();
            } else {
                System.out.print(suit + ", ");
            }            
            i++;
        }
        
        for(CardRank rank : CardRank.values()){
            if(CardRank.values().length == i) {
                System.out.print(rank);
                System.out.println();
            } else {
                System.out.print(rank + ", ");
            }
            i++;
        }
        System.out.println();
        
    }    
}
