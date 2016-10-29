package Task2_Deck;

public class Deck {
    
    public static void main(String[] args) {
        
        Card card = new Card();
        String[] deck = card.toString();
        
        for(int i = 0; i < deck.length; i++) {
            System.out.print(deck[i] + " ");
        }
        
    }
    
}
