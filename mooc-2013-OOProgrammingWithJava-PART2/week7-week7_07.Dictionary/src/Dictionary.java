/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author ryanw
 */
public class Dictionary {

    private HashMap<String, String> words;

    public Dictionary() {
        this.words = new HashMap<String, String>();
    }

    public String translate(String word) {
        if(this.words.containsKey(word)) {
            return this.words.get(word);
        }
        return null;
    }
    
    public void add(String word, String translation) {
        this.words.put(word, translation);
    }
    
    public ArrayList<String> translationList() {
        ArrayList<String> tlist = new ArrayList<String>();
        for(String keyword : this.words.keySet()) {
            tlist.add(keyword + " = " + this.words.get(keyword));
        }
        return tlist;
    }
    
    public int amountOfWords() {
        return this.words.size();
    }
}
