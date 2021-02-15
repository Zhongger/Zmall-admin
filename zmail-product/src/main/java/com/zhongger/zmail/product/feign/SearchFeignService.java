package com.zhongger.zmail.product.feign;

import com.zhongger.zmail.common.to.es.SkuEsModel;
import com.zhongger.zmail.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient("search")
public interface SearchFeignService {
    @PostMapping("/search/search/product")
    R productStatusUp(@RequestBody List<SkuEsModel> skuEsModels);
}
