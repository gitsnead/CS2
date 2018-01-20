/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;

/**
 *
 * @author ryanw
 */
public class Flights {
    private ArrayList<String[]> routes;
    
    public Flights() {
        this.routes = new ArrayList<String[]>();
    }
    
    public Flights(String planeId, String departure, String destination) {
        String[] route = {planeId, departure, destination};
        this.routes.add(route);
    }

    public void add(String planeId, String departure, String destination) {
        String[] route = {planeId, departure, destination};
        this.routes.add(route);
    }

    public ArrayList<String[]> getRoutes() {
        return routes;
    }
}
