package com.test.m2.svc;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class Service2 {
    @PostConstruct
    public void test() {
    	System.out.println("Service-2[TWO] from m2 module");
    }
}	