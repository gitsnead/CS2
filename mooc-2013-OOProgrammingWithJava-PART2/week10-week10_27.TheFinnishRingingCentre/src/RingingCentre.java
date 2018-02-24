/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.List;

/**
 *
 * @author ryanw
 */
public class RingingCentre {

    private Map<Bird, List<String>> spotlist;

    public RingingCentre() {
        this.spotlist = new HashMap<Bird, List<String>>();
    }

    public void observe(Bird bird, String location) {
        if (!this.spotlist.containsKey(bird)) {
            this.spotlist.put(bird, new ArrayList<String>());
        }
        this.spotlist.get(bird).add(location);
    }

    public void observations(Bird bird) {
        if (this.spotlist.containsKey(bird)) {
            System.out.println(bird.toString() + " observations: " + this.spotlist.get(bird).size());
            for (String spot : this.spotlist.get(bird)) {
                System.out.println(spot);
            } 
        } else {
            System.out.println(bird.toString() + " observations: 0");
        }
    }
}
