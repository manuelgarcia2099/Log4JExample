package main;

import org.apache.log4j.Logger;

public class Log4JExample {
	
	private static final Logger log = Logger.getLogger(Log4JExample.class);


	public static void main(String[] args) {
		
		log.debug("Hola mundo este es mi primer Log");
		log.debug("Hello world this is my first log");


	}

}
