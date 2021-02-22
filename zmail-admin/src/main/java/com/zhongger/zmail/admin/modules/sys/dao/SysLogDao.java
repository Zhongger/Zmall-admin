/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.zhongger.zmail.admin.modules.sys.dao;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhongger.zmail.admin.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 *
 * @author Mark sunlightcs@bytedance.com
 */
@Mapper
public interface SysLogDao extends BaseMapper<SysLogEntity> {

}
