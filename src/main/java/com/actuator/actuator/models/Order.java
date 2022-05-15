package com.actuator.actuator.models;

public class Order {
    public String orderId;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderInfo() {
        return "This is my order.";
    }


}
