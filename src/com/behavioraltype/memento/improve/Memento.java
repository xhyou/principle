package com.behavioraltype.memento.improve;

public class Memento {
    //攻击力
    private String atk;
    //防御力
    private String fik;

    public Memento(String atk,String fik){
        this.atk = atk;
        this.fik = fik;
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
