package com.smsoft.blogsamplecode.jsondataparsing.gson;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Person {
    String name;
    int age;
    boolean isEmployed;
    Address address;
    String[] phoneNumbers;
}
