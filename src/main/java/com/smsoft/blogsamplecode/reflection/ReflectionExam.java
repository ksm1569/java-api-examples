package com.smsoft.blogsamplecode.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExam {
    public static void main(String[] args) throws ClassNotFoundException {

        Class<?> personClass = Class.forName("com.smsoft.blogsamplecode.reflection.Person");
        System.out.println("1. 클래스 이름 조회 : " + personClass.getName());

        Constructor<?>[] constructors = personClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("2. 생성자 정보 조회 : " + constructor.toString());
        }

        Method[] methods = personClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("3. 메서드 정보 조회 : " + method.toString());
        }

        Field[] fields = personClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("4. 필드 정보 조회 : " + field.toString());
        }
    }
}
