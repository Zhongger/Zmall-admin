package com.zhongger.zmail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongger.zmail.common.utils.PageUtils;
import com.zhongger.zmail.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author zhongmingyi
 * @email zhongmingyi@bytedance.com
 * @date 2019-10-08 09:36:40
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

