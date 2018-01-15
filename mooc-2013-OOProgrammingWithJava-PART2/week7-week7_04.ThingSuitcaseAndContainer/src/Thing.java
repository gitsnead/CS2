/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanw
 */
public class Thing {
    private String name;
    private int weight;
    
    public Thing(String nName, int nKg) {
        this.name = nName;
        this.weight = nKg;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
    
    
}
