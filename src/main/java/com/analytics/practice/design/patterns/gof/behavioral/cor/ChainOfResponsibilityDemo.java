package com.analytics.practice.design.patterns.gof.behavioral.cor;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChainOfResponsibilityDemo {

    private static final Logger logger = Logger.getLogger(ChainOfResponsibilityDemo.class.getName());

    public static void main(String[] args) {
        //level to log at
        logger.setLevel(Level.FINER);

        ConsoleHandler handler = new ConsoleHandler();

        //level to publish at
        handler.setLevel(Level.FINER);
        logger.addHandler(handler);

        logger.finest("Finest level of logging");
        logger.finer("Finer level of logging");
        logger.fine("Fine level of logging");
    }
}
