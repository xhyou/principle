package com.behavioraltype.responsibilitychain;

public abstract  class Approver {

    Approver approver;

    String name;

    public Approver(String name){
        this.name = name;
    }

    public abstract void processRequest(PurchaseRequest purchaseRequest);

    public void setApprover(Approver approver) {
        this.approver = approver;
    }
}
