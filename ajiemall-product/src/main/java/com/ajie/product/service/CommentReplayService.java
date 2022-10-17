package com.ajie.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ajie.common.utils.PageUtils;
import com.ajie.product.entity.CommentReplayEntity;

import java.util.Map;

/**
 * 商品评价回复关系
 *
 * @author ajie
 * @email ajie@gmail.com
 * @date 2022-10-16 18:39:48
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

