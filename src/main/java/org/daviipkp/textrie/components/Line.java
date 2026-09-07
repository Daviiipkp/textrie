package org.daviipkp.textrie.components;

import org.daviipkp.textrie.Textrie;
import org.daviipkp.textrie.interfaces.Printable;

public class Line implements Printable {


    private String content = "";
    private String separator = "";

    public Line(String content) {
        this.content = content;
    }
    
    @Override 
    public void print(short tabCount, boolean debug) {
        if(content.isBlank()) {
            return;
        }
        if(debug) {
            Textrie.debug(tabCount, content);
            return;
        }
        Textrie.printWithTabs(tabCount, content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSeparator(String arg0) {
        separator = arg0;
    }

    public String getSeparator() {
        return separator;
    }

    public void append(Object... obj) {
        String s = Textrie.objArrayToString(separator, obj);
        content = content + separator + s;
    }
}
