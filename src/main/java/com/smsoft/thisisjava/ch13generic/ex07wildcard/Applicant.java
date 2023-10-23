package com.smsoft.thisisjava.ch13generic.ex07wildcard;

public class Applicant<T> {
    public T kind;

    public Applicant(T kind) {
        this.kind = kind;
    }
}
