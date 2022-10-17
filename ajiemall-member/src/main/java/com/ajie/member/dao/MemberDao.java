package com.ajie.member.dao;

import com.ajie.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author ajie
 * @email ajie@gmail.com
 * @date 2022-10-17 11:35:19
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
