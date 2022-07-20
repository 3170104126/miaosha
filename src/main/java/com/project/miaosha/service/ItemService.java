package com.project.miaosha.service;

import com.project.miaosha.error.BusinessException;
import com.project.miaosha.service.model.ItemModel;

import java.util.List;

/**
 * @author Fang Hongxin Email:3170104126@zju.edu.cn
 * @date 2022-07-07 20:11
 * @Description
 */
public interface ItemService {
    //创建商品
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    //商品列表浏览
    List<ItemModel> listItem();

    //商品详情浏览
    ItemModel getItemById(Integer id);

    //库存扣减
    boolean decreaseStock(Integer itemId, Integer amount) throws BusinessException;

    //销量增加
    void increaseSales(Integer itemId, Integer amount) throws BusinessException;
}
