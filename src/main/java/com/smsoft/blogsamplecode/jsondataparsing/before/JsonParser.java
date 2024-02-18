package com.smsoft.blogsamplecode.jsondataparsing.before;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JsonParser {
    public static Map<String, Object> parseJson(String json) {
        Map<String, Object> data = new HashMap<>();
        json = json.trim().substring(1, json.length() - 1); // 기본 JSON 문자열 전처리

        while (!json.isEmpty()) {
            int colonIndex = json.indexOf(':');
            if (colonIndex == -1) break;
            String key = json.substring(0, colonIndex).trim().replaceAll("^\"|\"$", "");
            json = json.substring(colonIndex + 1).trim();

            Object value;
            if (json.startsWith("[")) {
                int endIndex = findClosingBracketIndex(json, '[', ']') + 1;
                String arrayString = json.substring(0, endIndex);
                value = parseArray(arrayString);
                json = endIndex == json.length() ? "" : json.substring(endIndex + 1).trim();
            } else if (json.startsWith("{")) {
                int endIndex = findClosingBracketIndex(json, '{', '}') + 1;
                String objectString = json.substring(0, endIndex);
                value = parseJson(objectString);
                json = endIndex == json.length() ? "" : json.substring(endIndex + 1).trim();
            } else {
                int commaIndex = json.indexOf(",");
                int endIndex = (commaIndex == -1) ? json.length() : commaIndex;
                String stringValue = json.substring(0, endIndex).trim().replaceAll("^\"|\"$", "");
                value = parseValue(stringValue);
                json = (commaIndex == -1) ? "" : json.substring(endIndex + 1).trim();
            }

            data.put(key, value);

            if (!json.isEmpty() && json.startsWith(",")) json = json.substring(1).trim();
        }
        return data;
    }

    private static List<Object> parseArray(String arrayString) {
        List<Object> list = new ArrayList<>();
        arrayString = arrayString.trim().substring(1, arrayString.length() - 1);
        if (!arrayString.isEmpty()) {
            String[] items = arrayString.split(",");
            for (String item : items) {
                list.add(parseValue(item.trim().replaceAll("^\"|\"$", "")));
            }
        }
        return list;
    }

    private static Object parseValue(String value) {
        if (value.matches("-?\\d+")) {
            return Integer.parseInt(value);
        } else if (value.matches("-?\\d+\\.\\d+")) {
            return Double.parseDouble(value);
        } else {
            return value; // 문자열 값 반환
        }
    }

    private static int findClosingBracketIndex(String str, char open, char close) {
        int depth = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == open) depth++;
            else if (str.charAt(i) == close) {
                if (--depth == 0) return i;
            }
        }
        return -1; // 일치하는 닫는 괄호를 찾지 못한 경우
    }
}