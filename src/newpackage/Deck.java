/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package newpackage;

import java.util.Random;
import java.util.Stack;

/**
 *
 * @author Toshiba_TimP
 */
public class Deck {
    private Stack <Card> stack;
    private int countshake=100;
    public void generate(){
        String[] cardname = {"6","7","8","9","10","Валет","Дама","Король","Туз"};
        String[] suitname = {"Черви","Бубны","Трефы","Крести"};
        Random rand = new Random();
        for(int i=0;i<4;i++){
            for(int j=0;j<9;j++){
                stack.add(new Card(cardname[j], new Suit(suitname[i])));
            }
        }
        for (int i=0;i<countshake;i++){
            int index1 = rand.nextInt(stack.size());
            int index2 = rand.nextInt(stack.size());
            if(index1!=index2) {
                Card a1 = stack.get(index1);
                stack.set(index1,stack.get(index2));
                stack.set(index2,a1);
            }
        }
        /*for(int i=0;i<36;i++){
        stack.get(i);
        System.out.println(stack.get(i).getName() +" "+ stack.get(i).getSuitName());}*/
    }
    
    public Card getCard(){
        if(!stack.isEmpty()){return stack.pop();}
        return null;
    }
    
    public Deck() {
        stack = new Stack<>();
    }
}
