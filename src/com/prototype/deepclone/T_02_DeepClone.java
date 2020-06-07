package com.prototype.deepclone;

import com.prototype.deepclone.domain.Dog;
import com.prototype.deepclone.domain.Sheep;

public class T_02_DeepClone {

    public static void main(String[] args) throws CloneNotSupportedException{
        Dog dog = new Dog();
        dog.setName("小黑");
        dog.setSheep(new Sheep("多列"));

        Dog clone = (Dog) dog.deepClone();
        System.out.println("dog="+dog.getSheep().hashCode());
        System.out.println("clone="+clone.getSheep().hashCode());
    }
}
