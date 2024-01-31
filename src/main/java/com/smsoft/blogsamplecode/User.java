package com.smsoft.blogsamplecode;

public class User {
    private String id;
    private String pw;
    private String name;
    private int age;
    private String phone;

    public User() {
        super();
    }

    // 전체 필드 파라미터 생성자 넣었음
    public User(String id, String pw, String name, int age, String phone) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
