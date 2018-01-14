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
public class Changer {
    private ArrayList<Change> changeList;

    public Changer() {
        this.changeList = new ArrayList<Change>();
    }
    
    public void addChange(Change cr) {
        this.changeList.add(cr);
    }
    
    public String change(String characterString) {
        for(Change cr : this.changeList) {
            characterString = cr.change(characterString);
        }
        return characterString;
    }
}
