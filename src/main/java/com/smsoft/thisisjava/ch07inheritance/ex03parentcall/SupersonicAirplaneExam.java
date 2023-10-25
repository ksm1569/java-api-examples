package com.smsoft.thisisjava.ch07inheritance.ex03parentcall;

public class SupersonicAirplaneExam {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();

        sa.takeOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
