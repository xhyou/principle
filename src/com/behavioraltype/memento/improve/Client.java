package com.behavioraltype.memento.improve;

public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setAtk("100");
        gameRole.setFik("100");
        gameRole.saveMemento();
        System.out.println("大战前的状态为");
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(gameRole.saveMemento());
        gameRole.disPlay();


        System.out.println("大战后的状态为");
        gameRole.setAtk("80");
        gameRole.setFik("80");
        gameRole.saveMemento();
        gameRole.disPlay();

        System.out.println("调用备忘录");
        gameRole.recoverGameRoleFromMemento(caretaker.getMemento());
        gameRole.disPlay();
    }
}
