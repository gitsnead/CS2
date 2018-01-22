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
public class Roster {
    private ArrayList<Jumper> list;
    
    public Roster() {
        this.list = new ArrayList<Jumper>();
    }
    
    public void add(String name) {
        this.list.add(new Jumper(name));
    }

    public ArrayList<Jumper> getList() {
        return list;
    }
    
}
