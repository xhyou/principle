package com.creationtype.builder.normal.house;

import com.creationtype.builder.normal.service.AbstractHouse;

public class NormalHouse extends AbstractHouse {

    @Override
    protected void buildBasic() {
        System.out.println("普通的房子地基");
    }

    @Override
    protected void buildWalls() {
        System.out.println("普通的房子墙面");
    }

    @Override
    protected void roofed() {
        System.out.println("普通的房子屋顶");
    }

}
