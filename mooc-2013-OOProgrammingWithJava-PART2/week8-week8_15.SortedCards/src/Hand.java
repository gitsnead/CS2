/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ryanw
 */
public class Hand implements Comparable<Hand> {

    private ArrayList<Card> cards;

    public Hand() {
        this.cards = new ArrayList<Card>();
    }

    public void add(Card card) {
        this.cards.add(card);
    }

    public void sort() {
        Collections.sort(this.cards);
    }

    public void print() {
        for (Card card : this.cards) {
            System.out.println(card);
        }
    }

    private int getHandValue(Hand h) {
        int handValue = 0;
        for (Card card : h.cards) {
            handValue += card.getValue();
        }
        return handValue;
    }

    public void sortAgainstSuit() {
        Collections.sort(this.cards, new SortAgainstSuitAndValue());
    }
    
    @Override
    public int compareTo(Hand o) {
        int thisHandValue = getHandValue(this);
        int oHandValue = getHandValue(o);
        if (thisHandValue == oHandValue) {
            return 0;
        } else if (thisHandValue > oHandValue) {
            return 1;
        } else {
            return -1;
        }
    }
}
