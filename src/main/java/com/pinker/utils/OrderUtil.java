package com.pinker.utils;

public class OrderUtil {

    public static String getOrder(Integer orderId,String label){
        String orderStand=label+" desc";
        if(orderId!=null&&orderId==1){
            orderStand=label+" asc";
        }
        if(label==null ||label==""){
            return null;
        }
        return orderStand;
    }
}
