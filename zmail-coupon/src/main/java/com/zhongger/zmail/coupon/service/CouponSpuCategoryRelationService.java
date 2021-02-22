package com.zhongger.zmail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongger.zmail.common.utils.PageUtils;
import com.zhongger.zmail.coupon.entity.CouponSpuCategoryRelationEntity;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author zhongmingyi
 * @email zhongmingyi@bytedance.com
 * @date 2019-10-08 09:36:40
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

