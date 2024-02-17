package com.smsoft.blogsamplecode.formdataparsing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class FormDataParsingTest {

    @Test
    @DisplayName("application/x-www-form-urlencoded 폼 인코딩 형식의 데이터를 파싱해보자.")
    void parseDate() {
        String encodedFormData = "name=sumin+kim&age=30&city=New+York";
        Map<String, List<String>> result = FormDataParsing.parseDate(encodedFormData);

        assertEquals("sumin kim", result.get("name").get(0), "Name Parsing Failed.");
        assertEquals("30", result.get("age").get(0), "Age Parsing Failed.");
        assertEquals("New York", result.get("city").get(0), "City Parsing Failed.");
        assertNotEquals("Los Angeles", result.get("city").get(0));
    }
}