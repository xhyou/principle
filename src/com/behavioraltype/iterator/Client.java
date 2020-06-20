package com.behavioraltype.iterator;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        College  computerCollege= new ComputerCollege();
        College infoCollege = new InfoCollege();

        List<College> colleges = new ArrayList<>();
        colleges.add(computerCollege);
        colleges.add(infoCollege);

        OutputImpl output = new OutputImpl(colleges);
        output.printCollege();
    }
}
