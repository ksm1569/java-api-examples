package com.smsoft.thisisjava.ch7inheritance.ex11abstractmethod;

public class AbstractMethodExam {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat = new Cat();
        cat.sound();
        
        // 매개변수 다형성
        animalSound(new Dog());
        animalSound(new Cat());
    }

    public static void animalSound(Animal animal) {
        animal.sound();
    }
}
