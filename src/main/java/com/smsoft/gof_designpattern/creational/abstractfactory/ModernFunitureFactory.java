package com.smsoft.gof_designpattern.creational.abstractfactory;

import javax.swing.plaf.PanelUI;

// ConcreteFactory - Modern 제품군
public class ModernFunitureFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ModernChair();
    }
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }
}
