package com.zhongger.zmall.search.controller;

import com.zhongger.zmail.common.exception.BizCodeEnume;
import com.zhongger.zmail.common.to.es.SkuEsModel;
import com.zhongger.zmail.common.utils.R;
import com.zhongger.zmall.search.service.ProductSaveService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequestMapping("/search")
@RestController
public class ElasticSaveController {
    @Autowired
    private ProductSaveService productSaveService;
    //上架商品
    @PostMapping("/save/product")
    public R productStatusUp(@RequestBody List<SkuEsModel> skuEsModels) {
        boolean flag = false;
        try {
             flag = productSaveService.productStatusUp(skuEsModels);

        }catch (Exception e){
            log.error("ElasticSaveController商品上架错误:{}",e);
            return R.error(BizCodeEnume.PRODUCT_UP_EXCEPTION.getCode(),BizCodeEnume.PRODUCT_UP_EXCEPTION.getMsg());
        }
        if (flag){
            return R.ok();
        }else {
            return R.error(BizCodeEnume.PRODUCT_UP_EXCEPTION.getCode(),BizCodeEnume.PRODUCT_UP_EXCEPTION.getMsg());
        }

    }
}
