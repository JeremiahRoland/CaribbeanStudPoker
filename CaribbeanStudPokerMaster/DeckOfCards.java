/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 

import java.security.SecureRandom;

/**
 *
 * @author dnguy
 */
public class DeckOfCards {
    private Card[] deck;
    private int currentCard;    // index of next card to be dealt

    /**
     * Constructor to build deck of cards
     */
    public DeckOfCards()
    {
        String[] faces = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "jack", "queen", "king", "ace"};
        String[] suits = {"clubs", "spades", "diamonds", "hearts"};

        deck = new Card[52];
        currentCard = 0;

    }

    /**
     * Shuffle deck by choosing a card and swapping with another random card
     */
    public void shuffle()
    {
        currentCard = 0;

        SecureRandom randomNum = new SecureRandom();

        for (int first = 0; first < deck.length; first++)
        {
            int second = randomNum.nextInt(52);     //Selects random card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;

        }
    }
}
