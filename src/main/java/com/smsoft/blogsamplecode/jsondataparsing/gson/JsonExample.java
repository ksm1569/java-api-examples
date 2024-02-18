package com.smsoft.blogsamplecode.jsondataparsing.gson;

import com.google.gson.Gson;

public class JsonExample {
    public static void main(String[] args) {
        String json = "{\"name\":\"Sumin Kim\",\"age\":30,\"isEmployed\":true,\"address\":{\"street\":\"123 Main St\",\"city\":\"seoul\"},\"phoneNumbers\":[\"123-456-7890\",\"987-654-3210\"]}";

        // JSON 문자열을 자바 객체로 변환 (역직렬화)
        Gson gson = new Gson();
        Person person = gson.fromJson(json, Person.class);
        System.out.println(person);

        // 자바 객체를 다시 JSON 문자열로 변환 (직렬화)
        String newJson = gson.toJson(person);
        System.out.println(newJson);
    }

}
