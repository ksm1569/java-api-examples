package com.smsoft.ch13generic.ex04genericobject;

public class Box<T> {
    public T content;

    public boolean compare(Box<T> other) {
        boolean result = content.equals(other.content);
        return result;
    }
}
