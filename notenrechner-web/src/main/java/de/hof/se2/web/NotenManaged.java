/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.web;

import de.hof.se2.ejb.Studiengang;
import java.util.List;
import javax.enterprise.context.Dependent;
import javax.inject.Named;
/**
 *
 * @author markus
 */
@Named(value = "notenManaged")
@Dependent
public class NotenManaged {

    List<Studiengang> a; 
    /**
     * Creates a new instance of NotenManaged
     */
    public NotenManaged() {
        
    }
    
}
