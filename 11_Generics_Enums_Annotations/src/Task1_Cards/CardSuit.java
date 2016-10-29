package Task1_Cards;

public enum CardSuit {

    Clubs(1),
    Diamonds(2),
    Hearts(3),
    Spades(4);
    
    private final int cardSuit;
    
    private CardSuit(int cardSuit){
        this.cardSuit = cardSuit;
    }
    /*
    public static void getSuit(CardSuit[] suits) {
        
        int i = 1;
        
        for(CardSuit suit : values()){
            if(CardRank.values().length == i) {
                System.out.print(suit);
            } else {
                System.out.print(suit + ", ");
            }
            i++;
        }
        
    }
    */
    
}
