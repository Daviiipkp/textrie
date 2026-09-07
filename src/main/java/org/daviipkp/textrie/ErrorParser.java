package org.daviipkp.textrie;

import java.util.HashMap;
import java.util.Map;

import org.daviipkp.textrie.components.TextStack;

public class ErrorParser {

    private static final Map<Short, TextStack> map = new HashMap<>();

    public static void register(short num, TextStack text) {
        map.put(num, text);
    }

    public static void handle(short num) {
        map.get(num).print((short)0, false);
    }

}
