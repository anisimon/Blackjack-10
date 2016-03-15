package models;

import static org.junit.Assert.*;
/**
 * Created by cody on 3/14/16.
 */
public class testDealer {
    void testPlay(){
        Dealer d = new Dealer();
        Card c = new Card(1, Suit.Spades);


        while(d.play() == 1){
            d.addCard(c);
        }

        d.addCard(c);
        assertEquals(d.play(), 1);
    }
}
