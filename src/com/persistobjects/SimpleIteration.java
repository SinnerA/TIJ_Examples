package com.persistobjects;

import static com.utils.Print.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SimpleIteration {
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
        strs.add("8");
        strs.add("9");
        strs.add("10");
        strs.add("11");

        Iterator<String> it = strs.iterator();
        while(it.hasNext()){
            String str = it.next();
            printnb(str + " ");
        }
        print();
        for(String str : strs){
            printnb(str + " ");
        }
        print();
        it = strs.iterator();
        for(int i = 0; i < 6; i++){
            it.next();
            it.remove();
        }
        printnb(strs);
    }
}
