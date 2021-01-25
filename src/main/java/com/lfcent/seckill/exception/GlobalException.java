package com.lfcent.seckill.exception;

import com.lfcent.seckill.result.CodeMsg;

/**
 * Created by weicc on 2020/5/22.
 * <p>
 * 自定义全局异常类
 */
public class GlobalException extends RuntimeException {

    private static final long servialVersionUID = 1L;

    private CodeMsg codeMsg;

    public GlobalException(CodeMsg codeMsg) {
        super(codeMsg.toString());
        this.codeMsg = codeMsg;
    }

    public CodeMsg getCodeMsg() {
        return codeMsg;
    }
}
