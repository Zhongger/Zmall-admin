package com.zhongger.zmail.product.feign;

import com.zhongger.zmail.common.to.SkuReductionTo;
import com.zhongger.zmail.common.to.SpuBoundTo;
import com.zhongger.zmail.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("coupon")//声明要调用哪个服务
//在启动类上使用注解 @EnableFeignClients(basePackages = "com.zhongger.zmail.product.feign") 表示开启远程调用功能
public interface CouponFeignService {
    @PostMapping("/coupon/spubounds/save")
    R saveSpuBounds(@RequestBody SpuBoundTo SpuBoundTo);

    @PostMapping("/coupon/skufullreduction/saveInfo")
    R saveSkuReduction(@RequestBody SkuReductionTo skuReductionTo);
}
