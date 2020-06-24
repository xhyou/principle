package com.behavioraltype.memento;

public class Clinet {
    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState(" 状态#1 攻击力 100 ");
        Caretaker caretaker = new Caretaker();
        caretaker.add(originator.saveMemento());
        originator.setState(" 状态#2 攻击力 80 ");
        caretaker.add(originator.saveMemento());
        originator.setState(" 状态#3 攻击力 60 ");
        caretaker.add(originator.saveMemento());

        System.out.println("当前的状态是 =" + originator.getState());

        Memento memento = caretaker.get(0);
        originator.getStateFromMemento(memento);
        System.out.println("当前的状态是 =" +originator.getState());
    }
}
