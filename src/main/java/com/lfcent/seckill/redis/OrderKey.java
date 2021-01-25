package com.lfcent.seckill.redis;

/**
 * Created by weicc on 2020/5/29.
 */
public class OrderKey extends BasePrefix {

    public OrderKey(String prefix) {
        super(prefix);
    }
    public static OrderKey getSeckillOrderByUidGid = new OrderKey("seckill");
}
