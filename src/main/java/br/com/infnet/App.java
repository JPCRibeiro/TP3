package br.com.infnet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) {
        LOGGER.debug("Essa é uma mensagem de debug");
        LOGGER.info("Essa é uma mensagem de INFO");
        LOGGER.error("Essa é uma mensagem de ERROR");
    }
}
