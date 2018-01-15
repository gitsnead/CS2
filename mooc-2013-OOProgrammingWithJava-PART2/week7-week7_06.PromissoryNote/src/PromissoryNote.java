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
public class PromissoryNote {
    private HashMap<String, Double> Loan;

    public PromissoryNote() {
        this.Loan = new HashMap<String, Double>();
    }

    public void setLoan(String toWhom, double value) {
        this.Loan.put(toWhom, value);
    }
    
    public double howMuchIsTheDebt(String whose) {
        if(this.Loan.containsKey(whose)) {
            return this.Loan.get(whose);
        }
        return 0d;
    }
    
    
    
}
