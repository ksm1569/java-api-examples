package com.smsoft.gof_designpattern.abstractfactory;

// AbstractFactory
public interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
    Table createTable();
}
