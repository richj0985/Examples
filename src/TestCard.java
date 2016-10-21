
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class TestCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Card a1 = new Card(Card.SPADES, 5, true);
        Card a2 = new Card(Card.DIAMONDS, Card.KING, false);
        
        // Card 1
        System.out.println("A1: " + a1);
//        System.out.println("Card a1: ");
//        System.out.println("Suit: " + a1.getSuit());
//        System.out.println("Rank: " + a1.getRank());
//        System.out.println("Colour: " + a1.getColour());
//        System.out.println("Face Up: " + a1.isFaceUp());
//        System.out.println("Compare: " + a1.compareTo(a2));ng Information
//        
        
//        System.out.println("");
        
        // Card 2
        System.out.println("A2: " + a2);
//        System.out.println("Card a2: ");
//        System.out.println("Suit: " + a2.getSuit());
//        System.out.println("Rank: " + a2.getRank());
//        System.out.println("Colour: " + a2.getColour());
//        System.out.println("Face Up: " + a2.isFaceUp());
//        System.out.println("Compare: " + a2.compareTo(a1));
        
    }
}
