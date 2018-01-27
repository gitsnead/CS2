/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moving.domain;
import java.util.ArrayList;

/**
 *
 * @author ryanw
 */
public class Box implements Thing {
    private int maximumCapacity;
    private ArrayList<Thing> things;
    
    public Box(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
        this.things = new ArrayList<Thing>();
    }
    
    @Override
    public int getVolume() {
        int filled = 0;
        for(Thing thing : this.things) {
            filled += thing.getVolume();
        }
        return filled;
    }
    
    public boolean addThing(Thing thing) {
        if(thing.getVolume() + this.getVolume() <= maximumCapacity) {
            this.things.add(thing);
            return true;
        }
        return false;
    }
}
