package org.daviipkp.textrie.interfaces;

import org.daviipkp.textrie.Textrie;

public interface Printable {

    public void print(short tabCount);

    default void debugPrint(short tabCount) {
        if(Textrie.canDebug()) {
            print(tabCount);
        }
    }

}
