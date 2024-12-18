package com.test.m1.svc;

import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;

@Service
public class Service1 {
    @PostConstruct
    public void test() {
    	System.out.println("Service-1(ONE) from m1 module");
    }
}