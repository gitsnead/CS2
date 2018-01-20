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
public class Box implements ToBeStored {
    private ArrayList<ToBeStored> things;
    private double maxWeight;
    
    public Box(double weight) {
        this.things = new ArrayList<ToBeStored>();
        this.maxWeight = weight;
    }
    
    public void add(ToBeStored item) {
        if(weighBoxItems() + item.weight() <= this.maxWeight) {
            things.add(item);
        }
    }

    private double weighBoxItems() {
        double totalWeight = 0d;
        for(ToBeStored item : this.things) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    public double weight() {
        return this.weighBoxItems();
    }
    
    @Override
    public String toString() {
        return "Box: " + this.things.size() + " things, total weight " + this.weighBoxItems() + " kg";
    }
    
    
}
