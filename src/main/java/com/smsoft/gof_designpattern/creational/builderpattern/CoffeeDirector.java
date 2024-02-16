package com.smsoft.gof_designpattern.creational.builderpattern;

// Director 클래스
public class CoffeeDirector {
    private CoffeeBuilder builder;

    public CoffeeDirector(CoffeeBuilder builder) {
        this.builder = builder;
    }

    public Coffee orderAmericano() {
        builder.coffeeType("아메리카노");
        builder.milk(false);
        builder.sugar(false);
        return builder.build();
    }
}