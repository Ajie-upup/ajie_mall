package com.ajie.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ajie.common.utils.PageUtils;
import com.ajie.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author ajie
 * @email ajie@gmail.com
 * @date 2022-10-17 11:40:21
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

