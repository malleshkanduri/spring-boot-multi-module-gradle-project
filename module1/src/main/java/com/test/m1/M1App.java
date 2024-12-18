package com.test.m1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class M1App {
    public static void main(String[] args) {
    	System.out.println("Module-1 Application");
        SpringApplication.run(M1App.class, args);
    }
}