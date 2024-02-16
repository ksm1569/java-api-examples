package com.smsoft.gof_designpattern.creational.abstractfactory;

// AbstractFactory
public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
