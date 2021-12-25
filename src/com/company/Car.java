package com.company;

public class Car implements AutoCloseable {
    public Car() {
    }

    @Override
    public void close() {
        System.out.println("Car is closing");
    }
    public void drive(){
        System.out.println("Car on way");
    }
}
