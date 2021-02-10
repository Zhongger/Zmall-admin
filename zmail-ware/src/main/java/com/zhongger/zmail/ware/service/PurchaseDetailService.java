package com.zhongger.zmail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongger.zmail.common.utils.PageUtils;
import com.zhongger.zmail.ware.entity.PurchaseDetailEntity;

import java.util.List;
import java.util.Map;

/**
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-11-17 13:50:10
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<PurchaseDetailEntity> listDetailByPurchaseId(Long id);


}

