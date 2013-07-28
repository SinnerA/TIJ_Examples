package com.persistobjects;

import static com.utils.Print.*;

import java.util.ArrayList;
import java.util.Iterator;

public class CrossContainerIterator {
    public static void display(Iterator<String> it){
        while(it.hasNext()){
            Object obj = it.next();
            printnb(obj + " ");
        }
        print();
    }

    public static void main(String[] args) {
        ArrayList<String> strs = new ArrayList<String>();
        strs.add("0");
        strs.add("1");
        strs.add("2");
        strs.add("3");
        strs.add("4");
        strs.add("5");
        strs.add("6");
        strs.add("7");
        strs.add("8");
        strs.add("9");
        strs.add("10");
        strs.add("11");
        
        display(strs.iterator());
    }
}
