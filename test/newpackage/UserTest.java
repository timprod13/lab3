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
}
