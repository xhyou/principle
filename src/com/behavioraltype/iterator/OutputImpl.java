package com.behavioraltype.iterator;

import java.util.Iterator;
import java.util.List;

public class OutputImpl {
    //得到所有学院
    private List<College> colleges;

    public OutputImpl(List<College> colleges){
        this.colleges = colleges;
    }

    //遍历所有学院,然后调用printDepartment 输出各个学院的系
    public void printCollege() {
        Iterator<College> iterator = colleges.iterator();
        while(iterator.hasNext()){
            College college = iterator.next();
            System.out.println("=== "+college.getName() +"=====" );
            printDepartment(college.createIterator()); //得到对应迭代器
        }
    }

    private void printDepartment(Iterator iterator) {
        while (iterator.hasNext()){
            Department d = (Department) iterator.next();
            System.out.println(d.getName());
        }
    }
}
