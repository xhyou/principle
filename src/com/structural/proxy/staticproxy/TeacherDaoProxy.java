package com.structural.proxy.staticproxy;

public class TeacherDaoProxy implements ITeachDao{

    private ITeachDao teachDao;

    public TeacherDaoProxy(ITeachDao teachDao){
        this.teachDao = teachDao;
    }

    @Override
    public void teach() {
        System.out.println("授课前的准备");
        teachDao.teach();
        System.out.println("授课后的收拾");
    }
}
