/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Toshiba_TimP
 */
public class CardTest {
    
    public CardTest() {
    }
    
    /**
     * Test of getName method, of class Card.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String name = "Валет";
        Card instance = new Card(name,null);
        String result = instance.getName();
        assertEquals("Card неверен",name, result);
    }
    
    @Test
    public void testGetSuitName() {
        System.out.println("getName");
        String name = "Крести";
        Card instance = new Card("Валет",new Suit(name));
        String result = instance.getSuitName();
        assertEquals("Card неверен",name, result);
    }
    
}
