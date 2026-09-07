package org.daviipkp.textrie;

class Formatter implements AutoCloseable {

    private static short defaultTabCount = 0;
    private static short defaultTabSize = 2;
    private static String defaultMapSeparator = ": ";
    private static String defaultSeparator = "";
    private short tabCount = 0;
    private short tabSize = 2;
    private String mapSeparator = ": ";
    private String separator = "";
    private String lineSeparator;

    @Override
    public void close() throws Exception {
        tabCount = defaultTabCount;
        tabSize = defaultTabSize;
        mapSeparator = defaultMapSeparator;
        separator = defaultSeparator;
        lineSeparator = null;
    }

    public String getTabLine() {
        return getTab(tabCount, tabSize);
    }

    private static String getTab(short arg0, short arg1) {
        return " ".repeat(arg1).repeat(arg0);
    }

    public short getTabCount() {
        return tabCount;
    }

    public void setTabCount(short tabCount) {
        this.tabCount = tabCount;
    }

    public short getTabSize() {
        return tabSize;
    }

    public void setTabSize(short tabSize) {
        this.tabSize = tabSize;
    }

    public void setSeparator(String s) {
        separator = s;
    }

    public void setMapSeparator(String s) {
        mapSeparator = s;
    }

    public void setLineSeparator(String s) {
        lineSeparator = s;
    }


    //

    private void print(String s) {
        Textrie.print(getTabLine() + s);
    }


    public void printKeyValue(String key, String value) {
        print(key + mapSeparator + value);
    }

    public void print(Object... arr) {
        print(Textrie.objArrayToString(separator, arr));
    }

    public void printLines(Object... arr) {
        for(int i = 0; i < arr.length; i++) {
            print(arr[i]);
            if(lineSeparator != null && i < arr.length - 1) {
                print(lineSeparator);
            }
        }
    }

    
}
