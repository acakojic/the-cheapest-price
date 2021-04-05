package com.thecheapestprice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


@SpringBootApplication
public class MainApp extends SpringBootServletInitializer {

    /**
     * The main method for Najcena application.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {

        SpringApplication.run(MainApp.class, args);
    }
}
