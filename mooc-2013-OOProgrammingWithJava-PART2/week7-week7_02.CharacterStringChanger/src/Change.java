/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ryanw
 */
public class Change {

    private char fromCharacter;
    private char toCharacter;

    public Change(char fromChar, char toChar) {
        this.fromCharacter = fromChar;
        this.toCharacter = toChar;
    }
    
    public String change(String characterString) {
        return characterString.replace(this.fromCharacter, this.toCharacter);
    }
}
