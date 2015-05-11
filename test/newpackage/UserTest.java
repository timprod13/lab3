/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

import static org.junit.Assert.fail;
import org.junit.Test;

/**
 *
 * @author Toshiba_TimP
 */
public class UserTest {
    
    @Test
    public void testGetDeck(){
        User user = new User();
        if(user.getDeck()==null) fail("list не существует!");
    }
    
    @Test
    public void testAddCard(){
        User user = new User();
        user.addCard(new Card("6",new Suit ("Крести")));
        if(user.getDeck().isEmpty()) fail("add не add!");
        //System.out.println(user.getDeck().size());
    }
    
    @Test
    public void testRemoveCard(){
        User user = new User();
        user.addCard(new Card("6",new Suit ("Крести")));
        user.addCard(new Card("7",new Suit ("Крести")));
        user.addCard(new Card("8",new Suit ("Крести")));
        user.removeCard(2);
        if(user.getDeck().size() != 2) fail("remove не remove!");
    }

     @Test
    public void testGetMinTrump(){
        User user = new User();
        user.addCard(new Card("6",new Suit ("Крести")));
        user.addCard(new Card("7",new Suit ("Крести")));
        user.addCard(new Card("8",new Suit ("Червы")));
        user.addCard(new Card("6",new Suit ("Бубны")));
        user.addCard(new Card("7",new Suit ("Бубны")));
        user.addCard(new Card("8",new Suit ("Крести")));
        if(user.getMinTrump(new Suit("Крести")) == null) fail("getmin не getmin!");
    }
}

