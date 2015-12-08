/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.hof.se2.logWriter;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Logger;

public class LogWriter {

    private final File logPath; //File Objekt in dem das Logfile abgespeichert wird
    private final Boolean append;

    //Logger fürs schreiben der Fehler in ein Systemlog
    private static final Logger LOGGER = Logger.getLogger(LogWriter.class.getName());

    /**
     *
     * @param logPath
     * @param append true oder false, soll an ein evtl. schon vorhandenes
     * Logfile angehängt werden oder nicht
     * @throws IOException
     */
    public LogWriter(File logPath, Boolean append) {
        this.logPath = logPath;
        this.append = append;
    }
    
    /**
     *
     * @return 
     * @throws java.io.IOException
     */
    public Logger newLog() throws IOException {
        Handler handler = new FileHandler(logPath.getAbsolutePath(), append); // letzter Parameter = append
        LOGGER.addHandler(handler);
        return LOGGER;
    }
}