package com.smsoft.thisisjava.ch13generic.ex03genericinterface;

public class HomeAgency implements Rentable<Home>{
    @Override
    public Home rent() {
        return new Home();
    }
}
