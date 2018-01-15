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
public class Container {

    private final ArrayList<Suitcase> cargo;
    private final int cargoLimit;

    public Container(int weightLimit) {
        this.cargo = new ArrayList<Suitcase>();
        this.cargoLimit = weightLimit;
    }

    public int getCargoLimit() {
        return cargoLimit;
    }

    public void addSuitcase(Suitcase bag) {
        if (this.totalWeight() + bag.totalWeight() <= this.cargoLimit) {
            this.cargo.add(bag);
        }
    }

    public int totalWeight() {
        int totalKg = 0;
        for (Suitcase bag : this.cargo) {
            totalKg += bag.totalWeight();
        }
        return totalKg;
    }

    public void printThings() {
        for (Suitcase bag : this.cargo) {
            bag.printThings();
        }
    }

    @Override
    public String toString() {
        if (this.cargo.isEmpty()) {
            return "empty (0 kg)";
        }
        return this.cargo.size() + " suitcases (" + this.totalWeight() + " kg)";
    }

}
