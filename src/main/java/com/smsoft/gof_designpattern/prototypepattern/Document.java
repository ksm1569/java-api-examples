package com.smsoft.gof_designpattern.prototypepattern;

// Prototype
public interface Document extends Cloneable{
    Document cloneDocument() throws CloneNotSupportedException;
    void editContent(String newContent);
    void display();
}
