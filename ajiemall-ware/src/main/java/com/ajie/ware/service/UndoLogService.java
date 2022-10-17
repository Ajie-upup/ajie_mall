package com.ajie.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ajie.common.utils.PageUtils;
import com.ajie.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author ajie
 * @email ajie@gmail.com
 * @date 2022-10-17 11:45:12
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

