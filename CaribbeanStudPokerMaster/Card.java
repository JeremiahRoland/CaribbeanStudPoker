/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dnguy
 */
public class Card {
    private String faceName;
    private String suit;
    private int faceValue;

    /**
     * Card class Constructor
     * @param suit "clubs", "spades", "diamonds", "hearts"
     * @param face = 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen,king, ace
     * @param value = 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
     */
    public Card(String suit, String face, int value)
    {
        this.suit = suit;
        this.faceName = face;
        this.faceValue = value;
    }        

    /**
     * Returns the face name and suit
     * @return faceName and suit
     */
    public String getCard()
    {
        return faceName + " of " + suit;
    }

    /**
     * Returns card value
     * @return faceValue
     */
    public int getCardValue()
    {
        return faceValue;
    }

}
