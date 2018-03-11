/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.util.Random;

/**
 *
 * @author ryanw
 */
public class Cow implements Alive, Milkable {
    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};
    private String name;
    private double capacity;
    private double amount;

    public Cow() {
        int num = new Random().nextInt(31);
        this.name = this.NAMES[num];
        this.setVitals();
    }
    
    public Cow(String name) {
        this.name = name;
        this.setVitals();
    }
    
    private void setVitals() {
        int num = 15 + new Random().nextInt(26);
        capacity = num;
        amount = 0d;        
    }

    public String getName() {
        return this.name;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double getAmount() {
        return this.amount;
    }

    @Override
    public void liveHour() {
        double num = 0.7d + (new Random().nextInt(14) / 10d);
        if (this.amount + num >= this.capacity) {
            this.amount = this.capacity;
        } else {
            this.amount += num;
        }
    }

    @Override
    public double milk() {
        double amt = this.amount;
        this.amount = 0d;
        return amt;
    }

    @Override
    public String toString() {
        return this.name + " " + Math.ceil(this.amount) + "/" + Math.ceil(this.capacity);
    }
    
    
}
