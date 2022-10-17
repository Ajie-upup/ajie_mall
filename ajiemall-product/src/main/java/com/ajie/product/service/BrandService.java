package com.ajie.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ajie.common.utils.PageUtils;
import com.ajie.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author ajie
 * @email ajie@gmail.com
 * @date 2022-10-16 18:39:48
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

