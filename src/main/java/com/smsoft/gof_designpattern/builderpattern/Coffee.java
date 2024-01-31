package com.smsoft.gof_designpattern.builderpattern;

// Product 클래스
public class Coffee {
    private final String type;
    private final boolean milk;
    private final boolean sugar;

    public Coffee(String type, boolean milk, boolean sugar) {
        this.type = type;
        this.milk = milk;
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", milk=" + milk +
                ", sugar=" + sugar +
                '}';
    }
}