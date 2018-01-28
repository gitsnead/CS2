/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author ryanw
 */
public class PersonalDuplicateRemover implements DuplicateRemover {
    private Set<String> unique = new HashSet<String>();
    private int duplicateCount = 0;
    
    @Override
    public void add(String characterString) {
        if(this.unique.contains(characterString)) {
            this.duplicateCount++;
        } else {
            this.unique.add(characterString);
        }
    }

    @Override
    public int getNumberOfDetectedDuplicates() {
        return this.duplicateCount;
    }

    @Override
    public Set<String> getUniqueCharacterStrings() {
        return this.unique;
    }

    @Override
    public void empty() {
        this.unique = new HashSet<String>();
        this.duplicateCount = 0;
    }
    
}
