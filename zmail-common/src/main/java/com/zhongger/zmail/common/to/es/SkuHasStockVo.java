package com.zhongger.zmail.common.to.es;

import lombok.Data;

@Data
public class SkuHasStockVo {
    private Long skuId;
    private Boolean hasStock;
}
