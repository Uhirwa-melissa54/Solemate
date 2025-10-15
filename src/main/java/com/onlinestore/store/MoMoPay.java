package com.onlinestore.store;

import org.springframework.stereotype.Component;

@Component
public class MoMoPay implements Payment{
    @Override
    public void processPayment(double amount){
        System.out.println("Paid"+ amount +"using MoMoPay");
    }
}
