package com.smsoft.gof_designpattern.creational.builderpattern;


// Client 클래스
public class Main {
    public static void main(String[] args) {
        // StarbucksCoffeeBuilder 직접 사용
        CoffeeBuilder builder = new StarbucksCoffeeBuilder();
        Coffee coffee = builder.coffeeType("라떼")
                .milk(true)
                .sugar(false)
                .build();

        // 커스텀 커피
        System.out.println(coffee);

        // 디렉터를 통해서 커피를 뽑아내보자
        CoffeeBuilder coffeeBuilder = new StarbucksCoffeeBuilder();
        CoffeeDirector director = new CoffeeDirector(coffeeBuilder);
        Coffee directorCoffee = director.orderAmericano();
        
        // 디렉터로 만든 템플릿커피
        System.out.println(directorCoffee);
    }
}
