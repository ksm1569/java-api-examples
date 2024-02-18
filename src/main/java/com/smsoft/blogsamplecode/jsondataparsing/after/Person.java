package com.smsoft.blogsamplecode.jsondataparsing.after;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class Person {
    private String name;
    private int age;
    private List<String> skills;
    private Address address; // 내부 클래스 또는 별도 클래스로 정의 필요
}
