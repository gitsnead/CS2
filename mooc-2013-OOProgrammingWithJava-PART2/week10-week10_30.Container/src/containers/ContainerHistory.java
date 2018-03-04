/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containers;

import static java.lang.Math.abs;
import static java.lang.Math.pow;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ryanw
 */
public class ContainerHistory {
    private ArrayList<Double> situations;

    public ContainerHistory() {
        this.situations = new ArrayList<Double>();
    }

    public void add(double situation) {
        this.situations.add(situation);
    }
    
    public double average() {
        double summation = 0;
        if (this.situations.size() > 0) {
            for(Double element : this.situations) {
                summation += element;
            }
            return summation / this.situations.size();
        }
        return summation;
    }

    public double greatestFluctuation() {
        ArrayList<Double> flux = this.getFluctuations();
        Collections.sort(flux);
        return flux.get(flux.size() - 1);
    }
    
    public double maxValue() {
        if (this.situations.size() > 0) {
            ArrayList<Double> sorted = this.sortValues();
            return sorted.get(sorted.size() - 1);
        }
        return 0;
    }
    
    public double minValue() {
        if (this.situations.size() > 0) {
            ArrayList<Double> sorted = this.sortValues();
            return sorted.get(0);
        }
        return 0;
    }
    
    public void reset() {
        this.situations = new ArrayList<Double>();
    }

    public double variance() {
        Double variance = 0d;
        if (this.situations.size() > 1) {
            Double sumOfSquares = 0d;
            for(Double fluctuation : this.situations) {
                sumOfSquares += pow(fluctuation-this.average(), 2d);
            }
            variance = sumOfSquares/(this.situations.size() - 1);
        }
        return variance;
    }
    
    private ArrayList<Double> getFluctuations() {
        ArrayList<Double> flux = new ArrayList<Double>();
        if (this.situations.size() > 1) {
            for(int i = 1; i < this.situations.size(); i++) {
                flux.add(abs(this.situations.get(i-1) - this.situations.get(i)));
            }
        } else {
            flux.add(0d);
        }
        return flux;
    }
    
    private ArrayList<Double> sortValues() {
        ArrayList<Double> lst = new ArrayList<Double>();
        for(Double element : this.situations) {
            lst.add(element);
        }
        Collections.sort(lst);
        return lst;
    }
    
    @Override
    public String toString() {
        return this.situations.toString();
    }
    
    
}
