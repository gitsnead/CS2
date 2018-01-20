/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanw
 */
public class MilitaryService implements NationalService {
    private int daysLeft;
    
    public MilitaryService(int setDays) {
        if (setDays < 0) {
            this.daysLeft = 0;
        }
        this.daysLeft = setDays;
    }

    @Override
    public int getDaysLeft() {
        return this.daysLeft;
    }

    @Override
    public void work() {
        if (this.daysLeft > 0) {
            this.daysLeft -= 1;
        }
    }
    
    
}
