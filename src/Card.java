
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class Card {
    
    // SUITS
    public static final int SPADES = 0;
    public static final int CLUBS = 1;
    public static final int DIAMONDS = 2;
    public static final int HEARTS = 3;
    
    // RANKS FOR FACE CARDS
    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    
    // instance variables
    private int suit;
    private int rank;
    private Color colour;
    private boolean faceUp;
    
    /**
     * A constructor to create a new playing card
     * @param suit the suit of the playing card
     * @param rank the rank of the playing card
     * @param faceUp is the card face up
     */
    public Card(int suit, int rank, boolean faceUp){
        this.suit = suit;
        this.rank = rank;
        this.faceUp = faceUp;
        
        if(this.suit == Card.SPADES || this.suit == Card.CLUBS){
            colour = Color.BLACK;
        } else{
            colour = Color.RED;
        }
    }
    
    /**
     * Compares the ranks of two Cards
     * @param a the card to compare values with
     * @return 0 means the cards are equivalent, 
     *         less than 0 card is less than a, 
     *         greater than 0 card is bigger than a
     */
    public int compareTo(Card a){
        return this.rank - a.rank;
    }
    
    /**
     * Returns the suit of the playing card
     * @return the suit of the playing card
     */
    public int getSuit(){
       return this.suit; 
    }
    
    /**
     * Returns the rank of the playing card
     * @return the rank of the playing card
     */
    public int getRank(){
        return this.rank;
    }
    
    /**
     * Returns the colour of the playing card
     * @return the colour of the playing card
     */
    public Color getColour(){
        return this.colour;
    }
    
    /**
     * Returns if the card is face up or not
     * @return true if the playing card face up
     */
    public boolean isFaceUp(){
        return this.faceUp;
    }
    
    /**
     * Method to flip the card from face up to face down or vice-versa
     */
    public void flipCard(){
        
        faceUp = !faceUp;
        
//        if(faceUp){
//            faceUp = false;
//        } else{
//            faceUp = true;
//        }
    }
    
    /**
     * Returns the instant variables in a string
     * @return the string representation of the card
     */
    @Override
    public String toString(){
        
        String Rank = "";
        String Colour = "";
        String Suit = "";
        String FaceUp = "";
        
        if(this.suit == Card.JACK){
            Rank = "jack";
        } else if(this.suit == Card.KING){
            Rank = "king";
        } else if(this.suit == Card.QUEEN){
            Rank = "queen";
        } else if(this.suit == Card.ACE){
            Rank = "ace";
        } 
          
        
        if(this.colour == Color.RED){
            Colour = "red";
        } else if(this.colour == Color.BLACK){
            Colour = "black";
        }
        
        if(this.suit == Card.SPADES){
            Suit = "spades";
        } else if(this.suit == Card.CLUBS){
            Suit = "clubs";
        } else if(this.suit == Card.DIAMONDS){
            Suit = "diamonds";
        } else if(this.suit == Card.HEARTS){
            Suit = "hearts";
        }
        
        if(this.faceUp == true){
            FaceUp = "up";
        } else if(this.faceUp == false){
            FaceUp = "down";
        }
        
        return "This card is the " + Rank + "(" + this.rank + ")" + " of " + Suit + " and is " + Colour + ". Also its face is " + FaceUp + ".";
    }
}
