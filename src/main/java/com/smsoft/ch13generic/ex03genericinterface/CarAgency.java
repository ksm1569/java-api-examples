package com.smsoft.ch13generic.ex03genericinterface;

public class CarAgency implements Rentable<Car>{
    @Override
    public Car rent() {
        return new Car();
    }
}
