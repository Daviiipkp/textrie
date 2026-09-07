package org.daviipkp.textrie.components;

public class CountingLine extends Line {

    public CountingLine(String content) {
        super(content);
    }

    private int useCount = 0;

    @Override
    public void print(short tabCount) {
        useCount++;
        super.print(tabCount);
    }

    public int getPrintedTimes() {
        return useCount;
    }
    
}
