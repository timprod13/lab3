/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

/**
 *
 * @author Toshiba_TimP
 */
public class Card {
    
    private String name;
    private Suit suit;
    
    public Card(String name,Suit suit){
      this.name = name;
      this.suit = suit;
    }
    
    public String getName (){
        return name;
    }
    
    public String getSuitName (){
        return suit.getName();
    }
    
    public int compare(Card card){
        int a = Card.getValue(this.name);
        int b = Card.getValue(card.getName());
        if (a>b) return 1;
        if (a==b) return 0;
        return -1;                
    }
     
    public static int getValue(String name){
        switch(name){
            case "6":return 0;
            case "7":return 1;
            case "8":return 2;
            case "9":return 3;
            case "10":return 4;
            case "Валет":return 5;
            case "Дама":return 6;
            case "Король":return 7;
            case "Туз":return 8;
        }
           return -1;     
    }
     
    
}
