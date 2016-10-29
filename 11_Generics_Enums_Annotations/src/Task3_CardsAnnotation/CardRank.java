package Task3_CardsAnnotation;

@CardsAnnotation(type = "enum", category = "CardGames", description = "Contains a set of constants for the ranks of a card.")
public enum CardRank {

    Two(2), 
    Three(3), 
    Four(4), 
    Five(5), 
    Six(6), 
    Seven(7), 
    Eight(8), 
    Nine(9), 
    Ten(10), 
    Jack(11), 
    Queen(12), 
    King(13), 
    Ace(14);
    
    private final int cardRank;
    
    private CardRank(int cardRank){
        this.cardRank = cardRank;
    }
    
    /*
    public static void getRank(CardRank[] ranks) {
        
        int i = 1;
        
        for(CardRank rank : values()){
            if(CardRank.values().length == i) {
                System.out.print(rank);
            } else {
                System.out.print(rank + ", ");
            }
            i++;
        }
    */

    
}
