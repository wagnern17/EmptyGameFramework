package edu.up.cs301.spadestest;

/**
 * Created by wagnern17 on 11/8/2015.
 */
public class Card {

    private int rank;
    private String suit;

    /**
     * ctor for Card object
     * @param r int that holds the rank of a Card object, 2-13
     * @param s string that holds the suit of a Card object
     */
    public Card(int r, String s) {
        rank = r;
        suit = s;
    }

    public int getRank(){
        int temp = this.rank;
        return temp;
    }

    public String getSuit(){
        String temp = this.suit;
        return temp;
    }

    public void setRank(int r){
        this.rank = r;
    }

    public void setSuit(String s){
        this.suit = s;
    }

    public void rankCheck(Card c){
        if(c.getRank() < 2 || c.getRank() > 13){
            c.setRank(2);
        }
        return;
    }
}
