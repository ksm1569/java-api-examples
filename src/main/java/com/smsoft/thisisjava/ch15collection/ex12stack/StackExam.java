package com.smsoft.thisisjava.ch15collection.ex12stack;

import java.util.Stack;

public class StackExam {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<Coin>();

        coinBox.push(new Coin(200));
        coinBox.push(new Coin(50));
        coinBox.push(new Coin(10));

        while (!coinBox.isEmpty()) {
            Coin coin = coinBox.pop();
            System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
        }

    }
}
