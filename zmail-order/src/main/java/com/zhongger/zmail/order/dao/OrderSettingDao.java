package com.zhongger.zmail.order.dao;

import com.zhongger.zmail.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 *
 * @author zhongmingyi
 * @email zhongmingyi@bytedance.com
 * @date 2019-10-08 09:56:16
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {

}
