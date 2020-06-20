package com.behavioraltype.iterator;

import java.util.Iterator;
import java.util.List;

public  class InfoCollegeIterator implements Iterator {

    List<Department> departments;
    int index = 0;

    public InfoCollegeIterator(List<Department> departments){
        this.departments = departments;
    }

    @Override
    public boolean hasNext() {
        if(index>departments.size()-1){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Department department = departments.get(index);
        index+=1;
        return department;
    }

    @Override
    public void remove() {

    }
}
