package com.creationtype.prototype.deepclone;

import com.creationtype.prototype.deepclone.domain.Dog;
import com.creationtype.prototype.deepclone.domain.Sheep;

public class T_01_DeepClone {

    public static void main(String[] args) throws CloneNotSupportedException{
        Dog dog = new Dog();
        dog.setName("小黑");
        dog.setSheep(new Sheep("多列"));

        Dog clone = dog.clone();
        System.out.println("dog="+dog.getSheep().hashCode());
        System.out.println("clone="+clone.getSheep().hashCode());
    }
}
