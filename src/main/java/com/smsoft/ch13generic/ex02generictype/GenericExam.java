package com.smsoft.ch13generic.ex02generictype;

public class GenericExam {
    public static void main(String[] args) {
        Product<Tv, String> product1 = new Product<>();

        product1.setKind(new Tv());
        product1.setModel("LG NEW TV");

        Tv tv = product1.getKind();
        System.out.println(tv);

        String tvModel = product1.getModel();
        System.out.println(tvModel);

        Product<Car, String> product2 = new Product<>();

        product2.setKind(new Car());
        product2.setModel("벤츠");

        Car car = product2.getKind();
        System.out.println(car);

        String carModel = product2.getModel();
        System.out.println(carModel);
    }
}
