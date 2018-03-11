/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;

/**
 *
 * @author ryanw
 */
public class BulkTank {

    private final double capacity;
    private double volume;

    public BulkTank() {
        this.capacity = 2000f;
        this.volume = 0f;
    }

    public BulkTank(double capacity) {
        this.capacity = capacity;
        this.volume = 0f;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getVolume() {
        return this.volume;
    }

    public double howMuchFreeSpace() {
        return this.capacity - this.volume;
    }

    public void addToTank(double amount) {
        if (amount <= 0) {
            return;
        }
        if (amount > this.howMuchFreeSpace()) {
            this.volume = this.capacity;
        } else {
            this.volume += amount;
        }
    }

    public double getFromTank(double amount) {
        if (amount <= 0) {
            return 0;
        }
        if (amount > this.volume) {
            double everything = this.volume;
            this.volume = 0f;
            return everything;
        }
        this.volume -= amount;
        return amount;
    }

    @Override
    public String toString() {
        return Math.ceil(this.volume) + "/" + Math.ceil(this.capacity);
    }
    
    
}
