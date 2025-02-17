package com.example;


import java.util.ServiceLoader;

public class Main {
    public static void main(String[] args) {
        ServiceLoader<SimpleService> loads = ServiceLoader.load(SimpleService.class);
        for (SimpleService service : loads) {
            System.out.println("service.info() = " + service.info());
            System.out.println("service.simple() = " + service.simple());
        }
    }
}