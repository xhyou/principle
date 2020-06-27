package com.behavioraltype.responsibilitychain;

public class Client {
    public static void main(String[] args) {
        PurchaseRequest purchaseRequest = new PurchaseRequest(6000.0f,1);
        DepartmentApprover departmentApprover = new DepartmentApprover("张主任");
        CollegeApprover collegeApprover = new CollegeApprover("李主任");
        departmentApprover.setApprover(collegeApprover);
        collegeApprover.setApprover(departmentApprover);

        departmentApprover.processRequest(purchaseRequest);

    }
}
