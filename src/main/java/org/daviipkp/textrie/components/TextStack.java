package org.daviipkp.textrie.components;

import java.util.ArrayList;
import java.util.List;

import org.daviipkp.textrie.Textrie;
import org.daviipkp.textrie.interfaces.Printable;

public class TextStack implements Printable {

    private List<Line> l;

    private Line separator;

    private boolean shouldTabSeparator = false;

    public TextStack() {
        l = new ArrayList<>();
    }

    public void append(Line component) {
        l.add(component);
    }

    public void append(Object... arr) {
        l.add(new Line(Textrie.objArrayToString("", arr)));
    }

    public void appendLines(Object... arr) {
        for(Object obj : arr) {
            l.add(new Line(obj.toString()));
        }
    }

    public void appendLines(Line... arr) {
        for(Line a : arr) {
            l.add(a);
        }
    }

    @Override
    public void print(short tabCount, boolean debug) {
        for(Line c : l) {
                c.print(tabCount, debug);
            }
            int s = l.size();
            if(separator == null) {
                for(int i = 0; i < s; i++) {
                    l.get(i).print(tabCount, debug);
                }
            }else{
                for(int i = 0; i < s; i++) {
                    l.get(i).print(tabCount, debug);
                    if(i < s-1) {
                        separator.print(shouldTabSeparator?tabCount:0, debug);
                    }
                }
            }
    }


    public void setShouldTabSeparator(boolean b) {
        shouldTabSeparator = b;
    }
}
