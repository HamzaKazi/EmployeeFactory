package com.sparta;

//import com.sparta.EmployeeFactory;

import com.sparta.employee.EmployeeStarter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 * Hello world!
 *
 */
public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args ) {
        EmployeeStarter.start();
        logger.info("Hello, log4j2!");
    }

}
