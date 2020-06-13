package com.structural.builder;

import java.sql.Driver;
import java.sql.DriverManager;

public class Client {
    public static void main(String[] args) {
        Folded folded = new Folded(new HuaWei());
        folded.call();
    }
}
