/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import javax.enterprise.inject.Default;
import javax.xml.ws.BindingType;

/**
 * LoggedIn Produziert einen Benutzer, der für die Session bestehen bleibt
 * @author Schmidbauer
 **/

@Retention(RUNTIME)
@BindingType
@Default
public @interface LoggedIn {}

