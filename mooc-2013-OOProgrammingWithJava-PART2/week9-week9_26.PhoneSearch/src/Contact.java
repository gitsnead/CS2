
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private Map<String, List<String>> phones = new HashMap<String, List<String>>();
    
    public void addPhone(String name, String phone) {
        if(this.phones.containsKey(name)) {
            this.phones.get(name).add(phone);
        } else {
            this.phones.put(name, new ArrayList());
            this.phones.get(name).add(phone);
        }
    }
}
