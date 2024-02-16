package com.smsoft.gof_designpattern.creational.abstractfactory;

// Client
public class FurnitureStore {
    private FurnitureFactory factory;

    public FurnitureStore(FurnitureFactory factory) {
        this.factory = factory;
    }

    public void orderFurniture() {
        Chair chair = factory.createChair();
        Sofa sofa = factory.createSofa();
        Table table = factory.createTable();

        chair.create();
        sofa.create();
        table.create();
    }
    public static void main(String[] args) {
        // 생성자를 이용한 Modern 제품군 create
        FurnitureFactory modernFactory = new ModernFunitureFactory();
        FurnitureStore store = new FurnitureStore(modernFactory);
        store.orderFurniture();

        // 생성자를 이용한 Traditional 제품군 create
        FurnitureFactory traditionalFactory = new TraditionalFurnitureFactory();
        FurnitureStore store2 = new FurnitureStore(traditionalFactory);
        store2.orderFurniture();
    }
}
