

package com.zhongger.zmail.admin.modules.job.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongger.zmail.admin.common.utils.PageUtils;
import com.zhongger.zmail.admin.modules.job.entity.ScheduleJobLogEntity;

import java.util.Map;

/**
 * 定时任务日志
 */
public interface ScheduleJobLogService extends IService<ScheduleJobLogEntity> {

    PageUtils queryPage(Map<String, Object> params);

}
