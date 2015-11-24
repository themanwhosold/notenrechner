/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.sessionBean;

import de.hof.se2.managedBean.OutForProfessors;
import de.hof.se2.managedBean.OutForStudents;
import javax.ejb.Singleton;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Klasse die alle Schreibvorgänge auf die DB managed
 * @author markus
 * @version 0.1
 * @since 24.11.2015
 */



@Singleton
public class DBWriter implements DBWriterLocal {
    
@PersistenceContext
EntityManager em;

@Inject
OutForStudents outStudents;
OutForProfessors outProfessor;


}
