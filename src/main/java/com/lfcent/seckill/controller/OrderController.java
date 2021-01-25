package com.lfcent.seckill.controller;

import com.lfcent.seckill.bean.OrderInfo;
import com.lfcent.seckill.bean.User;
import com.lfcent.seckill.redis.RedisService;
import com.lfcent.seckill.result.CodeMsg;
import com.lfcent.seckill.result.Result;
import com.lfcent.seckill.service.GoodsService;
import com.lfcent.seckill.service.OrderService;
import com.lfcent.seckill.service.UserService;
import com.lfcent.seckill.vo.GoodsVo;
import com.lfcent.seckill.vo.OrderDetailVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by weicc on 2020/5/28.
 */
@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    UserService userService;

    @Autowired
    RedisService redisService;

    @Autowired
    OrderService orderService;

    @Autowired
    GoodsService goodsService;

    @RequestMapping("/detail")
    @ResponseBody
    public Result<OrderDetailVo> info(Model model, User user,
                                      @RequestParam("orderId") long orderId) {
        if(user == null) {
            return Result.error(CodeMsg.SESSION_ERROR);
        }
        OrderInfo order = orderService.getOrderById(orderId);
        if(order == null) {
            return Result.error(CodeMsg.ORDER_NOT_EXIST);
        }
        long goodsId = order.getGoodsId();
        GoodsVo goods = goodsService.getGoodsVoByGoodsId(goodsId);
        OrderDetailVo vo = new OrderDetailVo();
        vo.setOrder(order);
        vo.setGoods(goods);
        return Result.success(vo);
    }

}
