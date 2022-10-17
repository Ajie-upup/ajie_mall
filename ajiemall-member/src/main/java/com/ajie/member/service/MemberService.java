package com.ajie.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ajie.common.utils.PageUtils;
import com.ajie.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author ajie
 * @email ajie@gmail.com
 * @date 2022-10-17 11:35:19
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

