package com.behavioraltype.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {

    private List<ComputerPart> computerParts = new ArrayList<>();

    //增加到list
    public void attach(ComputerPart p) {
        computerParts.add(p);
    }
    //移除
    public void detach(ComputerPart p) {
        computerParts.remove(p);
    }

    //显示测评情况
    public void display(Visitor action) {
        for(ComputerPart p: computerParts) {
            p.accept(action);
        }
    }
}
