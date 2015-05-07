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
public class SuitTest {
    
    public SuitTest() {
    }
    /**
     * Test of getName method, of class Suit.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        String name = "Крести";
        Suit instance = new Suit(name);
        String result = instance.getName();
        assertEquals("Suit неверен",name, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
