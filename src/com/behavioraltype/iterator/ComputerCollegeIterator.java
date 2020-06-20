package com.behavioraltype.iterator;

import java.util.Iterator;

public class ComputerCollegeIterator implements Iterator {

    Department[] department;
    int position = 0;

    public ComputerCollegeIterator(Department[] department){
        this.department = department;
    }

    @Override
    public boolean hasNext() {
        if(position>department.length || department[position]==null){
            return  false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = this.department[position];
        position+=1;
        return department;
    }
}
