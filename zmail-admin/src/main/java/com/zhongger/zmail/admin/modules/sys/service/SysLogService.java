/**
 * Copyright (c) 2016-2019 人人开源 All rights reserved.
 * <p>
 * https://www.renren.io
 * <p>
 * 版权所有，侵权必究！
 */

package com.zhongger.zmail.admin.modules.sys.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongger.zmail.admin.common.utils.PageUtils;
import com.zhongger.zmail.admin.modules.sys.entity.SysLogEntity;

import java.util.Map;


/**
 * 系统日志
 *
 * @author Mark sunlightcs@bytedance.com
 */
public interface SysLogService extends IService<SysLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
