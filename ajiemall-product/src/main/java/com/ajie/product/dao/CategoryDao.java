package com.ajie.product.dao;

import com.ajie.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author ajie
 * @email ajie@gmail.com
 * @date 2022-10-16 18:39:48
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
