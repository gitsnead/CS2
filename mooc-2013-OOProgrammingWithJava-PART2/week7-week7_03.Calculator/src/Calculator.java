/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanw
 */
public class Calculator {

    private Reader reader;
    private int calculations = 0;

    public Calculator() {
        this.reader = new Reader();
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private int[] getValues() {
        int[] values = new int[2];
        System.out.print("value1: ");
        values[0] = this.reader.readInteger();
        System.out.print("value2: ");
        values[1] = this.reader.readInteger();
        this.calculations++;
        return values;
    }

    private void sum() {
        int[] addends = getValues();
        System.out.println("sum of the values " + (addends[0] + addends[1]));
        System.out.println("");
    }
    
    private void difference() {
        int[] minuendSubtrahend = getValues();
        System.out.println("difference of the values " + (minuendSubtrahend[0] - minuendSubtrahend[1]));
        System.out.println("");
    }
    
    private void product() {
        int[] factors = getValues();
        System.out.println("product of the values " + (factors[0] * factors[1]));
        System.out.println("");
    }
    
    private void statistics() {
        System.out.println("Calculations done " + this.calculations);
    }
}
