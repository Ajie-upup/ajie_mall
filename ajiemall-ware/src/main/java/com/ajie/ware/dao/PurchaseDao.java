package com.ajie.ware.dao;

import com.ajie.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author ajie
 * @email ajie@gmail.com
 * @date 2022-10-17 11:45:12
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
