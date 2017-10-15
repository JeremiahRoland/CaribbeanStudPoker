import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
import java.util.ArrayList;
import java.util.Random; 
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.*; 
/**
 * The code for the Caribbean Stud Poker game 
 *
 * @author Jeremiah Roland
 */
public class CSP_Game
{
    /**
     * Create a constructor to make the game frame
     * This is done when then corresponding button is clicked in startFrame
     * Constructs a new frame that's initially invisible
     * Throws a HeadlessException
     */
    public CSP_Game() throws HeadlessException
    {
    }
    public void run()
    {
        //create the frame
        JFrame cspFrame = new JFrame("Caribbean Stud Poker");
        
        //create a button to return to the previous page
        JButton close = new JButton("Close Game");
        close.setFont(new Font("Arial", Font.PLAIN, 35)); 
        //button to draw cards and place them into player and dealer hands 
        JButton drawCards = new JButton("DrawCards"); 
        drawCards.setFont(new Font("Arial", Font.PLAIN, 35));
        //button to place an ante 
        JButton placeAnte = new JButton("Ante Up");
        placeAnte.setFont(new Font("Arial", Font.PLAIN, 35));
        //button to raise the current bet 
        JButton raise = new JButton("Raise");
        raise.setFont(new Font("Arial", Font.PLAIN, 35));
        //button to fold the current hand 
        JButton fold = new JButton("Fold");
        fold.setFont(new Font("Arial", Font.PLAIN, 35));
        //button to enter into the progressive jackpot feature 
        JButton progJack = new JButton("Progressive Jackpot");
        progJack.setFont(new Font("Arial", Font.PLAIN, 35)); 
        /**
         * When the close button is clicked, have the program closed.
         * Add an action listener and use an anonymous class to 
         * implement the ActionListener interface
         * Have the method actionPerformed(ActionEvent name) called and set what 
         * needs to be done in the method
         * For this, call the startFrame constructor, then the run method to show the
         * start frame, then dispose of the CSP frame
         * @param the implicit parameter of this type of call is the button associated
         * with it 
         */
        close.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent exit)
           {
               startFrame returnStart = new startFrame();
               returnStart.run();
               cspFrame.dispose(); 
           }
        }); 
        /**
         * When the drawCards button is clicked, generate the cards to be placed in the 
         * player's and dealer's respective hands.
         * Add an action listener and use an anonymous class to 
         * implement the ActionListener interface
         * Have the method actionPerformed(ActionEvent name) called and set what 
         * needs to be done in the method
         * @param the implicit parameter of this type of call is the button associated
         * with it 
         */
        
        /**
         * When the placeAnte button is clicked, take money from the player's current 
         * money and place it on the layout (the bet) 
         * Add an action listener and use an anonymous class to 
         * implement the ActionListener interface
         * Have the method actionPerformed(ActionEvent name) called and set what 
         * needs to be done in the method
         * @param the implicit parameter of this type of call is the button associated
         * with it 
         */
        placeAnte.addActionListener(new ActionListener()
        {
           public void actionPerformed(ActionEvent exit)
           {
               /**
                * Check if the player has enough money to place the ante 
                * If not, then display a message saying "not enough funds"
                * If yes, then withdraw the amount from playerMoney
                * Do the same with Dealer's money
                * .
                */
               /**
                * After the withdraw, offer the player the option for the 
                * Progressive Jackpot feature
                * If they accept, then withdraw the money from playerMoney 
                * If not, then do nothing and close the option
                * Use Random Number Generator to decide if Dealer will take part 
                * in Progressive Jackpot feature
                * Once PJ and ante money is in, deal the cards (use drawCards method) 
                * . 
                */
               /**
                * Once cards are dealt, display the Raise and Fold buttons 
                * If the raise button is pressed, ask for user input for the amount 
                * of money to raise
                * Compare this money to playerMoney to see if they have the coin 
                * to make the raise
                * If not, then display a message saying "not enough money"
                * If yes, then withdraw money from playerMoney and place in bet pool
                * When the player raises, the dealer does too 
                * If the fold button is pressed, then clear bet pool and restart game 
                * .
                */
               /**
                * Once the player is done raising, then show the dealer's cards and 
                * compare them to the player's cards 
                * Use the rules to determine who won 
                * .
                */
           }
        });
        drawCards.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent draw)
            {
                //declare the array in the action performed section
                //this way, when the button is pressed, it refreshes the deck of cards
                ArrayList<String> cardDeck = new ArrayList<String>(); 
                //hearts
                cardDeck.add("AH");
                cardDeck.add("2H");
                cardDeck.add("3H");
                cardDeck.add("4H");
                cardDeck.add("5H");
                cardDeck.add("6H");
                cardDeck.add("7H");
                cardDeck.add("8H");
                cardDeck.add("9H");
                cardDeck.add("10H");
                cardDeck.add("JH");
                cardDeck.add("QH");
                cardDeck.add("KH"); 
                //spades 
                cardDeck.add("AS");
                cardDeck.add("2S");
                cardDeck.add("3S");
                cardDeck.add("4S");
                cardDeck.add("5S");
                cardDeck.add("6S");
                cardDeck.add("7S");
                cardDeck.add("8S");
                cardDeck.add("9S");
                cardDeck.add("10S");
                cardDeck.add("JS");
                cardDeck.add("QS");
                cardDeck.add("KS");
                //diamonds 
                cardDeck.add("AD");
                cardDeck.add("2D");
                cardDeck.add("3D");
                cardDeck.add("4D");
                cardDeck.add("5D");
                cardDeck.add("6D");
                cardDeck.add("7D");
                cardDeck.add("8D");
                cardDeck.add("9D");
                cardDeck.add("10D");
                cardDeck.add("JD");
                cardDeck.add("QD");
                cardDeck.add("KD");
                //clubs 
                cardDeck.add("AC");
                cardDeck.add("2C");
                cardDeck.add("3C");
                cardDeck.add("4C");
                cardDeck.add("5C");
                cardDeck.add("6C");
                cardDeck.add("7C");
                cardDeck.add("8C");
                cardDeck.add("9C");
                cardDeck.add("10C");
                cardDeck.add("JC");
                cardDeck.add("QC");
                cardDeck.add("KC");
                Random rand = new Random(); 

                int n = 51;
                String playerHand = "";
                String dealerHand = ""; 
                //for loop to deal the dealer his hand
                for(int i = 0; i < 5; i++)
                {
                    int cardNum = rand.nextInt(n) + 0;
                    dealerHand += cardDeck.get(cardNum);
                    cardDeck.remove(cardNum);
                    n--; 
                }
                for(int j = 0; j < 5; j++)
                {
                    int cardNum2 = rand.nextInt(n) + 0;
                    playerHand += cardDeck.get(cardNum2);
                    cardDeck.remove(cardNum2); 
                    n--;
                }

                /**
                 * Create a JTextArea to display text so it is easier to read 
                 * than the default text size for the JOptionPane
                 * set editable, opaque, text, and font to make it easy to read
                 * @method setEditable makes it so the user can't edit it
                 * @method setOpague(false) sets the background of the 
                 *         text area to clear
                 * @method setText adds text output to the text area
                 * @method setFont sets the font of the text area
                 */


                JTextArea outputText = new JTextArea();
                outputText.setEditable(false);
                outputText.setOpaque(false);
                outputText.setText("Player Hand: " + playerHand + "\n" + "Dealer Hand: " + dealerHand);
                outputText.setFont(outputText.getFont().deriveFont(25f));

                JOptionPane.showMessageDialog(cspFrame, outputText, "Cards Have Been Dealt", JOptionPane.INFORMATION_MESSAGE);
                //sets the drawCards button to invisible once it has been clicked
                //when clicked a second time, an error occured
                //to solve this, whenever the current hand has been dealt, make the button invisible 
                drawCards.setVisible(false);
            }
        });
        
        /**
         * Set layout of the frame
         * Then, add each part of the frame
         */
        cspFrame.setLayout(new GridLayout(10, 1));
        cspFrame.add(placeAnte);
        cspFrame.add(close);
        /**
         * @method setDefaultCloseOperation(), used to close the program if 
         * the window of the program is closed, so as to avoid the program 
         * continuing to run after user closes the window
         * use the pack() to set the size of the frame to fit all of its contents
         * then, set the frame to visible
         */
        cspFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cspFrame.pack();
        cspFrame.setVisible(true); 
    }
}
