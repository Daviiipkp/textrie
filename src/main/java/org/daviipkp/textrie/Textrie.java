package org.daviipkp.textrie;

import java.util.function.Consumer;

public class Textrie {
    
    private static boolean debug = false;

    private static StringBuilder b = new StringBuilder();

    private static Formatter f = new Formatter();

    private static Consumer<String> printMethod = text -> {
        System.out.println(text);
    };
    private static Consumer<String> debugMethod = text -> {
        System.out.println(text);
    };

    public static void debug(String s) {
        debugMethod.accept(s);
    }

    public static void debug(Object... arr) {
        debug(objArrayToString("", arr));
    }

    public static void debugIfNotNull(String s) {
        if(s != null) {
            debugMethod.accept(s);
        }
    }

    public static void debugWithTabs(short tabs, String s) {
        debug(getTab(tabs, (short)2) + s);
    }

    public static void debugWithTabs(short tabs, Object... args) {
        debug(getTab(tabs, (short)2) + objArrayToString("",args));
    }

    public static void print(String s) {
        printMethod.accept(s);
    }

    public static void print(Object... arr) {
        print(objArrayToString("", arr));
    }

    public static void printIfNotNull(String s) {
        if(s != null) {
            printMethod.accept(s);
        }
    }

    public static void printWithTabs(short tabs, String s) {
        print(getTab(tabs, (short)2) + s);
    }

    public static void printWithTabs(short tabs, Object... args) {
        print(getTab(tabs, (short)2) + objArrayToString("",args));
    }

    public static String objArrayToString(String s, Object... arr) {
        for(int i = 0; i < arr.length; i++) {
            b.append(arr[i]);
            if(i < (arr.length-1)) {
                b.append(s);
            }
        }
        String ss = b.toString();
        b.setLength(0);
        return ss;
    }



    //GETTERS AND SETTERS

    private static String getTab(short arg0, short arg1) {
        return " ".repeat(arg1).repeat(arg0);
    }

    public static void setDebug(boolean arg0) {
        debug = arg0;
    }

    public static boolean canDebug() {
        return debug;
    }

    public static Formatter getFormattedPrinter() {
        return f;
    }
    public static void setPrintingMethod(Consumer<String> method) {
        printMethod = method;
    }

    public static void setDebuggingMethod(Consumer<String> method) {
        debugMethod = method;
    }
}
