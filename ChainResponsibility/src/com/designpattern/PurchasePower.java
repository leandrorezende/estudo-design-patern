package com.designpattern;

public abstract class PurchasePower {
    protected static final double BASE = 10;
    protected PurchasePower sucessor;

    abstract protected double getAllowable();
    abstract protected String getRole();

    public PurchasePower getSucessor() {
        return sucessor;
    }

    public void setSucessor(PurchasePower sucessor) {
        this.sucessor = sucessor;
    }

    public void processRequest(PurchaseRequest request){
        if(request.getAmount() < this.getAllowable()){
            System.out.println(this.getRole() + " will aprove $" + request.getAmount());
        } else if(sucessor != null)
            sucessor.processRequest(request);
    }
}
