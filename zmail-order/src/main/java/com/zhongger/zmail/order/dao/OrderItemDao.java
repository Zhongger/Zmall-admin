package com.zhongger.zmail.order.dao;

import com.zhongger.zmail.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author zhongmingyi
 * @email zhongmingyi@bytedance.com
 * @date 2019-10-08 09:56:16
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
