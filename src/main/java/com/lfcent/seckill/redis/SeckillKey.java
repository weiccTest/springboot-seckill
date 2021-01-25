package com.lfcent.seckill.redis;

/**
 * Created by weicc on 2020/5/29.
 */
public class SeckillKey extends BasePrefix {
    private SeckillKey(String prefix) {
        super(prefix);
    }

    public static SeckillKey isGoodsOver = new SeckillKey("go");
}
