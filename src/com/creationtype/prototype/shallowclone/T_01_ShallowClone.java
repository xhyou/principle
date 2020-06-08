package com.creationtype.prototype.shallowclone;

import com.creationtype.prototype.shallowclone.domain.Sheep;

//在没有使用到我们的克隆模式之前,我们如果需要克隆一个对象需要new
public class T_01_ShallowClone {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("多利", 1);
        Sheep sheep1 = new Sheep("多利",1);
    }
}
