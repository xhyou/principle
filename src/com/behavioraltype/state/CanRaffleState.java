package com.behavioraltype.state;

import java.util.Random;

public class CanRaffleState extends State{

    RaffleActivity activity;

    public CanRaffleState(RaffleActivity activity){
        this.activity = activity;
    }

    @Override
    public void deductMoney() {
        System.out.println("已经扣取过了积分");
    }

    @Override
    public void dispensePrize() {
        System.out.println("没中奖，不能发放奖品");
    }

    @Override
    public boolean raffle() {
        System.out.println("正在抽奖，请稍等！");
        Random random = new Random(10);
        int num= random.nextInt(10);
        if(num==3){
            activity.setState(activity.getDispenseState());
            return true;
        }else{
            System.out.println("很遗憾没有抽中奖品！");
            // 改变状态为不能抽奖
            activity.setState(activity.getNoRafflleState());
            return false;
        }
    }
}
