/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author ryanw
 */
public class Thermometer implements Sensor {

    private int temperature;
    private boolean power;

    public Thermometer() {
        this.power = false;
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public boolean isOn() {
        return this.power;
    }

    @Override
    public void on() {
        this.power = true;
    }

    @Override
    public void off() {
        this.power = false;
    }

    @Override
    public int measure() {
        if (this.isOn()) {
            Random rand = new Random();
            this.temperature = rand.nextInt(60) - 30;
            return this.temperature;
        } else {
            throw new IllegalStateException("The thermometer is off!");
        }
    }

}
