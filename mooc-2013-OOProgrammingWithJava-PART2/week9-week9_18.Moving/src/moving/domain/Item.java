/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;

/**
 *
 * @author ryanw
 */
public class Item implements Thing, Comparable<Thing> {
    private String name;
    private int volume;
    
    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }

    @Override
    public String toString() {
        return this.name + " (" + this.volume + " dm^3)";
    }

    public int compareTo(Item o) {
        return this.volume - o.getVolume();
    }
    
    @Override
    public int compareTo(Thing o) {
        return this.volume - o.getVolume();
    }
    
}
