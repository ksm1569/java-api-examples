package com.smsoft.thisisjava.ch11exception.ex06custom;

import com.smsoft.thisisjava.ch09nestedclass.ex03localclass.A;

public class AccountExam {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        System.out.println("예금액 : " + account.getBalance());

        try {
            account.withdraw(11000);
        } catch (InsufficientException e) {
            System.out.println(e.toString());
        }
    }
}
