/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author ryanw
 */
public class Jumper implements Comparable<Jumper> {
    private final String name;
    private ArrayList<String> lengths;
    private int score;
    
    public Jumper (String participant) {
        this.name = participant;
        this.lengths = new ArrayList<String>();
        this.score = 0;
    }
    
    public void addScore(int round) {
        this.score += round;
    }
    
    public void addLength(String meters) {
        this.lengths.add(meters);
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public String printLengths() {
        String jumpLengths = "";
        for(int i = 0; i < lengths.size(); i++) {
            jumpLengths += lengths.get(i);
            if(i < lengths.size() - 1) {
                jumpLengths += ", ";
            }    
        }
        return jumpLengths;
    }    
    @Override
    public String toString() {
        return this.name + " (" + this.score + " points)";
    }

    @Override
    public int compareTo(Jumper o) {
        return this.score - o.score;
    }
    
}
