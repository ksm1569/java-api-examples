package com.smsoft.blogsamplecode.formdataparsing;

import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class FormDataParsing {
    public static Map<String, List<String>> parseDate(String data) {
        // name=sumin+kim&age=30&city=New+York
        Map<String, List<String>> parameters = new LinkedHashMap<>();
        String[] pairs = data.split("&");
        for (String pair : pairs) {
            String[] nameValue = pair.split("=");
            String name = URLDecoder.decode(nameValue[0], StandardCharsets.UTF_8);
            String value = "";
            if (nameValue.length == 2) {
                value = URLDecoder.decode(nameValue[1], StandardCharsets.UTF_8);
            }
            parameters.computeIfAbsent(name, k -> new LinkedList<>()).add(value);
        }

        return parameters;
    }
}
