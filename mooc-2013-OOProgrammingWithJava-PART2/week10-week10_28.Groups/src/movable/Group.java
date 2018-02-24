/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movable;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ryanw
 */
public class Group implements Movable {
    private List<Movable> herd;

    public Group() {
        this.herd = new ArrayList<Movable>();
    }
    
    public void addToGroup(Movable movable) {
        this.herd.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for(Movable individual : herd) {
            individual.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String members = "";
        for(Movable individual : herd) {
            members += individual.toString() + "\n";
        }
        return members; //To change body of generated methods, choose Tools | Templates.
    }
}
