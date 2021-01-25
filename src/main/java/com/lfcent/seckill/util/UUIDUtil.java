package com.lfcent.seckill.util;

import java.util.UUID;

/**
 * Created by weicc on 2020/5/22.
 * <p>
 * 唯一id生成类
 */
public class UUIDUtil {

    public static String uuid() {
        return UUID.randomUUID().toString().replace("-", "");
    }

}
