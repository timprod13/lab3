/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Toshiba_TimP
 */
public class DeckTest {
    
   @Test
   public void DeckTest(){
       Deck deck = new Deck();
       deck.generate();
    }
   
   @Test
   public void testGetCard(){
       Deck deck = new Deck();
       deck.generate();
       int count = 0;
       for(int i=0;i<36;i++){
           if(deck.getCard()!=null) count++;
       }
       assertEquals("Не хватает карт в колоде!",count,36);
   }
}
