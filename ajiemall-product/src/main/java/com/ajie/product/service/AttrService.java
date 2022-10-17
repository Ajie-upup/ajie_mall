package com.ajie.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ajie.common.utils.PageUtils;
import com.ajie.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author ajie
 * @email ajie@gmail.com
 * @date 2022-10-16 18:39:48
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

