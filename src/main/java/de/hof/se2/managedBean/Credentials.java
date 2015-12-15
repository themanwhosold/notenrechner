/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.managedBean;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;

/**
 * Hilfsklasse um die Login Informationen der Anmeldeseite in ein Objekt zu schreiben, welches nachher wieder
 * ausgelesen werden kann. Daten sind nicht Persistent, hierfür ist die Klasse User zuständig
 * @author Schmidbauer
 */
@Named(value = "credentials")
@RequestScoped

public class Credentials {

        

    private int username;

    private String password;

    /**
     * Zum holen des Übergebenen USernamens
     * @return Benutzer, als ID in der Datenbank angegeben
     */
    public int getUsername() { return username; }

    /**
     * Setzt Username auf die angegebene ID
     * @param username ID, des Benutzers der sich anmelden möchte
     */
    public void setUsername(int username) { this.username = username; }

    /**
     * Holt Passwort zum Vergleich der Datenbank ab
     * @return Passwort als String
     */
    public String getPassword() { return password; }

    /**
     * Passwort Setzen um es später in der DB auszulesen
     * @param password Setzt Passwort des Einloggenden auf den übergebenen Wert
     */
    public void setPassword(String password) { this.password = password; }

    

}