package com.behavioraltype.responsibilitychain;

public class CollegeApprover extends Approver {

    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice()>5000){
            System.out.println(" 请求类型 type= " + purchaseRequest.getType() + " 被 " + this.name + " 处理");
        }else{
            approver.processRequest(purchaseRequest);
        }
    }
}
