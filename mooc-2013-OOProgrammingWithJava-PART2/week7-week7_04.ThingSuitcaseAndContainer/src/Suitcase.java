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
public class Suitcase {

    private final ArrayList<Thing> things;
    private final int maxKg;

    public Suitcase(int weightLimit) {
        this.things = new ArrayList<Thing>();
        this.maxKg = weightLimit;
    }

    public Thing heaviestThing() {
        Thing big = null;
        for (Thing item : things) {
            if (big == null || item.getWeight() > big.getWeight()) {
                big = item;
            }
        }
        return big;
    }

    public int totalWeight() {
        int totalKg = 0;
        for (Thing item : this.things) {
            totalKg += item.getWeight();
        }
        return totalKg;
    }

    public void addThing(Thing thing) {
        if (this.totalWeight() + thing.getWeight() <= this.maxKg) {
            this.things.add(thing);
        }
    }

    public void printThings() {
        if (this.things.isEmpty()) {
            System.out.println("empty (0 kg)");
        } else {
            for (Thing item : things) {
                System.out.println(item);
            }
        }
    }

    @Override
    public String toString() {
        if (this.things.isEmpty()) {
            return "empty (0 kg)";
        } else if (this.things.size() == 1) {
            return this.things.size() + " thing (" + this.totalWeight() + " kg)";
        }
        return this.things.size() + " things (" + this.totalWeight() + " kg)";
    }

}
