/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author ryanw
 */
public class TextUserInterface {
    private Scanner reader;
    private Planes fleet;
    private Flights routes;
    
    public TextUserInterface (Scanner reader, Planes fleet, Flights routes) {
        this.reader = reader;
        this.fleet = fleet;
        this.routes = routes;
    }
    
    private void addPlane() {
        System.out.print("Give plane ID: ");
        String planeId = this.reader.nextLine();
        System.out.print("Give plane capacity: ");
        int capacity = Integer.parseInt(this.reader.nextLine());
        this.fleet.add(planeId, capacity);
    }
    
    private void addFlight() {
        System.out.print("Give plane ID: ");
        String planeId = this.reader.nextLine();
        System.out.print("Give departure airport code: ");
        String departure = this.reader.nextLine();
        System.out.print("Give destination airport code: ");
        String destination = this.reader.nextLine();
        this.routes.add(planeId, departure, destination);
    }
    
    private void airportPanel() {
        System.out.println("Airport panel");
        System.out.println("--------------------");
        System.out.println("");
        String input = "";
        while(!input.contentEquals("x")) {
            System.out.println("Choose operation:");
            System.out.println("[1] Add airplane");
            System.out.println("[2] Add flight");
            System.out.println("[x] Exit");
            System.out.print("> ");            
            input = this.reader.nextLine();
            if(input.contentEquals("1")) {
                this.addPlane();
            } else if(input.contentEquals("2")) {
                this.addFlight();
            }
        }
    }
    
    private void printFleet() {
        System.out.println(this.fleet.toString());
    }
    
    private void printRoutes() {
        for(String plane : this.fleet.getAirframes().keySet()) {
            for(String[] flight : this.routes.getRoutes()) {
                if (plane.contentEquals(flight[0])) {
                    System.out.println(plane + " (" + this.fleet.getSeats(plane) + " ppl) (" + flight[1] + "-" + flight[2] + ")");
                }
            }
        }
        System.out.println("");
    }
    
    private void printPlane() {
        System.out.println("Give plane ID: ");
        String input = this.reader.nextLine();
        System.out.println(input + " (" + this.fleet.getSeats(input) + " ppl)");
        System.out.println("");
    }
    
    public void flightServicePanel() {
        System.out.println("Flight service");
        System.out.println("------------");
        System.out.println("");
        String input = "";
        while(!input.contentEquals("x")) {
            System.out.println("Choose operation:");
            System.out.println("[1] Print planes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print plane info");
            System.out.println("[x] Quit");
            System.out.print("> ");
            input = this.reader.nextLine();
            System.out.println(input);
            if(input.contentEquals("1")) {
                this.printFleet();
            } else if(input.contentEquals("2")) {
                this.printRoutes();
            } else if(input.contentEquals("3")) {
                this.printPlane();
            }
        }
    }
    
    public void start() {
        airportPanel();
        flightServicePanel();
    }
}
