package com.ajie.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ajie.common.utils.PageUtils;
import com.ajie.order.entity.OrderReturnReasonEntity;

import java.util.Map;

/**
 * ้่ดงๅๅ 
 *
 * @author ajie
 * @email ajie@gmail.com
 * @date 2022-10-17 11:40:21
 */
public interface OrderReturnReasonService extends IService<OrderReturnReasonEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

