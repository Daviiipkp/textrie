package org.daviipkp.textrie;

import java.util.HashMap;
import java.util.Map;

import org.daviipkp.textrie.components.Line;

public class ErrorParser {

    private static final Map<Short, Line> map = new HashMap<>();

    public static void register(short num, Line text) {
        map.put(num, text);
    }

    public static void handle(short num) {
        map.get(num).print((short)0, false);
    }

}
