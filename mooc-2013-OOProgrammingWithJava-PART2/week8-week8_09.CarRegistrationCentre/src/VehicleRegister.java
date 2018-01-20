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
public class VehicleRegister {
    private HashMap<RegistrationPlate, String> owners;
    
    public boolean add(RegistrationPlate plate, String owner) {
        if(this.owners == null) {
            this.owners = new HashMap<RegistrationPlate, String>();
        }
        if(this.owners.containsKey(plate)) {
            return false;
        }
        this.owners.put(plate, owner);
        return true;
    }
    
    public String get(RegistrationPlate plate) {
        if(this.owners == null) {
            return null;
        }
        if(this.owners.containsKey(plate)) {
            return this.owners.get(plate);
        }
        return null;
    }
    
    public boolean delete(RegistrationPlate plate) {
        if(this.owners == null) {
            return false;
        }
        if(this.owners.containsKey(plate)) {
            this.owners.remove(plate);
            return true;
        }
        return false;
    }
    
    public void printRegistrationPlates() {
        if(this.owners == null) {
            System.out.println("");
        }
        String plates = "";
        for(RegistrationPlate plate : this.owners.keySet()) {
            plates += plate.toString() + "\n";
        }
        System.out.println(plates.trim());
    }
    
    public void printOwners() {
        if(this.owners == null) {
            System.out.println("");
        }
        HashMap<String, RegistrationPlate> uniqueOwners = new HashMap<String, RegistrationPlate>();
        for(RegistrationPlate plate : this.owners.keySet()) {
            uniqueOwners.put(this.owners.get(plate), plate);
        }
        String names = "";
        for(String owner : uniqueOwners.keySet()) {
            names += owner + "\n";
        }
        System.out.println(names.trim());
    }
}
