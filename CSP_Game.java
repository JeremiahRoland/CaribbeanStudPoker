import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
import java.util.ArrayList;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.*; 
/**
 * Write a description of class CSP_Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
         * Set layout of the frame
         * Then, add each part of the frame
         */
        cspFrame.setLayout(new GridLayout(10, 1));
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
