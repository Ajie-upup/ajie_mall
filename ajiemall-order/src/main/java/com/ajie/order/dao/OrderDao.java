package com.ajie.order.dao;

import com.ajie.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author ajie
 * @email ajie@gmail.com
 * @date 2022-10-17 11:40:21
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
