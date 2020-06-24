package com.behavioraltype.memento.improve;

public class GameRole {
    //攻击力
    private String atk;
    //防御力
    private String fik;

    public Memento saveMemento(){
        return new Memento(atk,fik);
    }

    public void recoverGameRoleFromMemento(Memento memento){
        this.atk = memento.getAtk();
        this.fik = memento.getFik();
    }

    public void disPlay(){
        System.out.println("当前的攻击力为:"+atk+":当前的防御力为:"+fik);
    }

    public String getAtk() {
        return atk;
    }

    public void setAtk(String atk) {
        this.atk = atk;
    }

    public String getFik() {
        return fik;
    }

    public void setFik(String fik) {
        this.fik = fik;
    }
}
