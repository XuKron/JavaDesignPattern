package com.net.markj.pattern01_simple_pattern.public_class;

/**
 * Created by Kron Xu on 2019/3/8 15:59
 * Description:
 */
public class ReceivedOrder implements Order {
    @Override
    public String getOrderType() {
        return "已接单订单";
    }
}
