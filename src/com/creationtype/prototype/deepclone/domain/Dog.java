package com.creationtype.prototype.deepclone.domain;

import java.io.*;

public class Dog implements Cloneable, Serializable {

    private String name;

    private Sheep sheep;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sheep getSheep() {
        return sheep;
    }

    public void setSheep(Sheep sheep) {
        this.sheep = sheep;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sheep=" + sheep +
                '}';
    }

    //通过将对象那边也实现序列话 实现一个深拷贝
    //但是这样有一个问题 当我对象那边不是简单的属性 而是有引用对象的话 可能需要多重嵌套
    @Override
    public Dog clone() throws CloneNotSupportedException {
        Dog dog = (Dog)super.clone();
        dog.setSheep((Sheep) sheep.clone());
        return dog;
    }

    //通过序列化的方式实现深拷贝,推荐使用
    public Object deepClone(){
        //输出流 输出流
        try(ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(bos);
           ) {
            oos.writeObject(this);
            try(ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                ObjectInputStream ois = new ObjectInputStream(bis);) {
                Dog dog = (Dog) ois.readObject();
                return dog;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
