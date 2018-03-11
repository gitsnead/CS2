/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farmsimulator;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author ryanw
 */
public class Farm implements Alive {
    private String owner;
    private Barn barn;
    private Collection<Cow> cows;

    public Farm(String farmer, Barn barn) {
        this.owner = farmer;
        this.barn = barn;
        this.cows = new LinkedList<Cow>();
    }

    public String getOwner() {
        return this.owner;
    }
    
    public String getBarn() {
        return this.barn.toString();
    }
    
    public String getCows() {
        if (this.cows.isEmpty()) {
            return "No cows.";
        }
        String herd = "Animals:\n";
        for (Cow cow : this.cows) {
            herd += "        " + cow.toString() + "\n";
        }
        return herd;
    }
    
    public void installMilkingRobot(MilkingRobot robot) {
        this.barn.installMilkingRobot(robot);
    }
    
    public void addCow(Cow cow) {
        this.cows.add(cow);
    }

    public void manageCows() {
        this.barn.takeCareOf(this.cows);
    }
    
    @Override
    public void liveHour() {
        for(Cow cow : this.cows) {
            cow.liveHour();
        }
    }
    
    @Override
    public String toString() {
        String farmInfo = "Farm owner: " + this.getOwner() + "\n";
        farmInfo += "Barn bulk tank: " + this.getBarn() + "\n";
        farmInfo += this.getCows();
        return farmInfo; //To change body of generated methods, choose Tools | Templates.
    }
}
