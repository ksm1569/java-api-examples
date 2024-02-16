package com.smsoft.gof_designpattern.creational.prototypepattern;

// Prototype
public interface Document extends Cloneable{
    Document cloneDocument() throws CloneNotSupportedException;
    void editContent(String newContent);
    void display();
}
