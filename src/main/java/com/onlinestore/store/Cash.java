package com.onlinestore.store;

public class Cash implements Payment{
    @Override
    public void processPayment(double amount){
        System.out.println("Paid"+amount+" using cash");
    }
}
