package com.smsoft.blogsamplecode.jsondataparsing.before;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class JsonParserTest {
//    {
//        "name": "Sumin Kim",
//        "age": 30,
//        "skills": ["Java", "Spring", "Docker"],
//        "address": {
//            "city": "seoul",
//            "country": "KOREA"
//        }
//    }
    @Test
    void parseJson() {
        String json = "{\"name\":\"Sumin Kim\",\"age\":30,\"skills\":[\"Java\",\"Spring\",\"Docker\"],\"address\":{\"city\":\"seoul\",\"country\":\"KOREA\"}}";
        Map<String, Object> result = JsonParser.parseJson(json);
        System.out.println(result);

        assertEquals("Sumin Kim", result.get("name"));
        assertEquals(30, result.get("age"));
        assertTrue(result.get("skills") instanceof List);

        @SuppressWarnings("unchecked")
        List<Object> skills = (List<Object>) result.get("skills");
        assertTrue(skills.contains("Java"));
        assertTrue(skills.contains("Spring"));
        assertTrue(skills.contains("Docker"));
        assertTrue(result.get("address") instanceof Map);

        @SuppressWarnings("unchecked")
        Map<String, Object> address = (Map<String, Object>) result.get("address");
        assertEquals("seoul", address.get("city"));
        assertEquals("KOREA", address.get("country"));
    }
}