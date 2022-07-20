package com.project.miaosha.service;

import com.project.miaosha.error.BusinessException;
import com.project.miaosha.service.model.OrderModel;

/**
 * @author Fang Hongxin Email:3170104126@zju.edu.cn
 * @date 2022-07-08 15:40
 * @Description
 */
public interface OrderService {

        //1.通过url上传过来秒杀活动id，然后下单接口内校验对应id是否属于对应商品且活动已开始
    //2.直接在下单接口内判断对应的商品是否存在秒杀活动，若存在进行中的则以秒杀价格下单
    //倾向于使用第一种形式，因为对同一个商品可能存在不同的秒杀活动，而且第二种方案普通销售的商品也需要校验秒杀
    OrderModel createOrder(Integer userId, Integer itemId, Integer promoId, Integer amount) throws BusinessException;
}