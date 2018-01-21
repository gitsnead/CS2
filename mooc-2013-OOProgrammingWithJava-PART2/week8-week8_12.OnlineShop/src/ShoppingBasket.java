/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author ryanw
 */
public class ShoppingBasket {
    private List<Purchase> purchases;
    
    public ShoppingBasket() {
        this.purchases = new ArrayList<Purchase>();
    }
    
    public void add(String product, int price) {
        boolean found = false;
        for(Purchase item : this.purchases) {
            if(item.getProduct().equals(product)) {
                item.increaseAmount();
                found = true;
                break;
            }
        }
        if (!found) {
            this.purchases.add(new Purchase(product, 1, price));
        }
    }
    
    public int price() {
        int cost = 0;
        for(Purchase item : purchases) {
            cost += item.price();
        }
        return cost;
    }
    
    public void print() {
        for(Purchase item : purchases) {
            System.out.println(item);
        }
    }
}
