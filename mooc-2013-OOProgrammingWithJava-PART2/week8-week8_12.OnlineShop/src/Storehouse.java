/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author ryanw
 */
public class Storehouse {
    private Map<String, Integer> prices = new HashMap<String, Integer>();
    private Map<String, Integer> stockList = new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stockList.put(product, stock);
    }
    
    public int price(String product) {
        if(this.prices.containsKey(product)) {
            return this.prices.get(product);
        }
        return -99;
    }
    
    public int stock(String product) {
        if(this.stockList.containsKey(product)) {
            return this.stockList.get(product);
        }
        return 0;
    }
    
    public boolean take(String product) {
        if(this.stock(product) > 0) {
            this.stockList.put(product, this.stock(product) - 1);
            return true;
        }
        return false;
    }
    
    public Set<String> products() {
        return this.prices.keySet();
    }
}
