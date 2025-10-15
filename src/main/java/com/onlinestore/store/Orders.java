package com.onlinestore.store;

import org.springframework.stereotype.Component;

@Component
public class Orders {
    private final Payment pay;

    Orders(Payment pay){
        this.pay=pay;
    }
    public void order(){
        pay.processPayment(2000);


    }
}
