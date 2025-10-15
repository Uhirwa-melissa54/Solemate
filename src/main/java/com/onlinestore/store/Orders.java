package com.onlinestore.store;

public class Orders {
    private Payment pay;

    Orders(Payment pay){
        this.pay=pay;
    }
    public void order(){
        pay.processPayment(2000);


    }
}
