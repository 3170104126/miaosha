package com.project.miaosha.service;

import com.project.miaosha.service.model.PromoModel;

/**
 * @author Fang Hongxin Email:3170104126@zju.edu.cn
 * @date 2022-07-09 9:08
 * @Description
 */
public interface PromoService {
    PromoModel getPromoByItemId(Integer itemId);
}
