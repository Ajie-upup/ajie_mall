package com.ajie.product.dao;

import com.ajie.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author ajie
 * @email ajie@gmail.com
 * @date 2022-10-16 18:39:48
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
