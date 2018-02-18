
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanw
 */
public class Contact {
    private Map<String, List<String>> phones;
    private Map<String, Address> home;

    public Contact() {
        this.phones = new HashMap<String, List<String>>();
        this.home = new HashMap<String, Address>();
    }

    public Map<String, List<String>> getPhones() {
        return phones;
    }

    public Map<String, Address> getHome() {
        return home;
    }
    
    public void addPhone(String name, String phone) {
        if(this.phones.containsKey(name)) {
            this.phones.get(name).add(phone);
        } else {
            this.phones.put(name, new ArrayList());
            this.phones.get(name).add(phone);
        }
    }
    
    public void addAddress(String name, String street, String city) {
        this.home.put(name, new Address(street, city));
    }
    
    public ArrayList<String> searchNumbersByPerson(String name) {
        if(this.phones.containsKey(name)) {
            return (ArrayList<String>) this.phones.get(name);
        }
        return new ArrayList<String>();
    }
    
    public String searchPersonByNumber(String number) {
        for(String name : this.phones.keySet()) {
            if(this.phones.get(name).contains(number))
                return " " + name;
        }
        return "  not found";
    }
    
    public String searchAddressbyPerson(String name) {
        if(this.home.containsKey(name)) {
            return "  address: " + this.home.get(name).toString();
        }
        return "  address unknown";
    }
    
    public boolean hasInfo(String name) {
        return this.phones.containsKey(name) || this.home.containsKey(name);
        
    }
    
    public HashSet<String> searchKeywordIterateSets(String term, Set<String> ppl) {
        HashSet<String> pplHits = new HashSet<String>();
        // iterative search through keys for term.
        for(String nameKey : ppl) {
            if(nameKey.contains(term)) {
                pplHits.add(nameKey);
            }
        }
        return pplHits;
    }
    
    public HashSet<String> searchKeyword(String term) {
        HashSet<String> pplHits = new HashSet<String>();
        pplHits.addAll(this.searchKeywordIterateSets(term, this.home.keySet()));
        pplHits.addAll(this.searchKeywordIterateSets(term, this.phones.keySet()));
        for(String addressKey : this.home.keySet()) {
            if(this.home.get(addressKey).toString().contains(term)) {
                pplHits.add(addressKey);
            }
        }
        return pplHits;
    }
}
