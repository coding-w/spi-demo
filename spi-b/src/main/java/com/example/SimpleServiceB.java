package com.example;


public class SimpleServiceB implements SimpleService {
    @Override
    public String info() {
        return "bbb SimpleServiceB info info";
    }

    @Override
    public String simple() {
        return "bbb SimpleServiceB simple simple";
    }
}
