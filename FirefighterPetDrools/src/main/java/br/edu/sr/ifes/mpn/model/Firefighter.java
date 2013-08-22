/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.sr.ifes.mpn.model;

/**
 *
 * @author salaboy
 */
public class Firefighter {

    private String name;

    public Firefighter() {
    }

    public Firefighter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Firefighter[name= '"+name+"']";
    }


    

}
