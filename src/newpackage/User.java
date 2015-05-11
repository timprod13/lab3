/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

import java.util.ArrayList;

/**
 *
 * @author Toshiba_TimP
 */
public class User {
    private ArrayList<Card> list;
    
     public User(){
         list = new ArrayList<>();
     }
     
     public ArrayList<Card> getDeck(){
         return list;
     }
     
     public void addCard(Card card){
         list.add(card);
     }
     
     public void removeCard(int index){
         list.remove(index);
     }
     
     public Card getMinTrump(Suit trump){
         Card min = list.get(0);
         for (int i=1;i<list.size();i++){
             if(list.get(i).compare(min) == -1) min =  list.get(i);
         }
         return min;
     }
     
}
