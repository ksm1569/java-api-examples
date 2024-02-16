package com.smsoft.gof_designpattern.creational.builderpattern;

// ConcreteBuilder 클래스
public class StarbucksCoffeeBuilder implements CoffeeBuilder {
    private String type = "에스프레소";
    private boolean milk = false;
    private boolean sugar = false;

    @Override
    public CoffeeBuilder coffeeType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public CoffeeBuilder milk(boolean milk) {
        this.milk = milk;
        return this;
    }

    @Override
    public CoffeeBuilder sugar(boolean sugar) {
        this.sugar = sugar;
        return this;
    }
    
    // 이 부분이 핵심
    @Override
    public Coffee build() {
        return new Coffee(type, milk, sugar);
    }
}