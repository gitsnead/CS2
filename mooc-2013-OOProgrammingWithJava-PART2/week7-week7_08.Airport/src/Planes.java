/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;

/**
 *
 * @author ryanw
 */
public class Planes {
    private HashMap<String, Integer> airframes;

    public Planes() {
        this.airframes = new HashMap<String, Integer>();
    }
    
    public Planes(String planeId, int capacity) {
        this.airframes.put(planeId, capacity);
    }
    
    public void add(String planeId, int capacity) {
        this.airframes.put(planeId, capacity);
    }

    public HashMap<String, Integer> getAirframes() {
        return airframes;
    }
    
    
    
    public int getSeats(String planeId) {
        if(this.airframes.containsKey(planeId)) {
            return this.airframes.get(planeId);
        }
        return 0;
    }

    @Override
    public String toString() {
        String list = "";
        for(String airframe : airframes.keySet()) {
            list += airframe + " (" + getSeats(airframe)+ " ppl)\n";
        }
        return list.trim();
    }
    
}
