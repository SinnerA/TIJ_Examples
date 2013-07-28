package com.persistobjects;

import static com.utils.Print.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteration {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<String>();
        strs.add("0");
        strs.add("1");
        strs.add("2");
        strs.add("3");
        strs.add("4");
        strs.add("5");
        strs.add("6");
        strs.add("7");
        ListIterator<String> it = strs.listIterator();
        while(it.hasNext()){
            print(it.next() + ", " + it.nextIndex() + ", " + it.previousIndex() + "; ");
        }
        print();
        while(it.hasPrevious()){
            printnb(it.previous() + " ");
        }
        print();
        print(strs);
        it = strs.listIterator(3);
        while(it.hasNext()){
            it.next();
            it.set("3+");
        }
        print(strs);
    }
}
