package com.lfcent.seckill.redis;

/**
 * Created by weicc on 2020/5/21.
 *
 * 缓冲key前缀
 */
public interface KeyPrefix {

    /**
     * 有效期
     * @return
     */
    public int expireSeconds();

    /**
     * 前缀
     * @return
     */
    public String getPrefix();
}
