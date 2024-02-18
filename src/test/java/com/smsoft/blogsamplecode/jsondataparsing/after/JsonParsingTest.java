package com.smsoft.blogsamplecode.jsondataparsing.after;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class JsonParsingTest {
    @Test
    void parseJsonWithJackson() throws IOException {
        String json = "{\"name\":\"Sumin Kim\",\"age\":30,\"skills\":[\"Java\",\"Spring\",\"Docker\"],\"address\":{\"city\":\"seoul\",\"country\":\"KOREA\"}}";

        ObjectMapper objectMapper = new ObjectMapper();
        Person person = objectMapper.readValue(json, Person.class);
        System.out.println(person);

        assertEquals("Sumin Kim", person.getName());
        assertEquals(30, person.getAge());
        assertTrue(person.getSkills().contains("Java"));
        assertTrue(person.getSkills().contains("Spring"));
        assertTrue(person.getSkills().contains("Docker"));
        assertEquals("seoul", person.getAddress().getCity());
        assertEquals("KOREA", person.getAddress().getCountry());
    }
}
