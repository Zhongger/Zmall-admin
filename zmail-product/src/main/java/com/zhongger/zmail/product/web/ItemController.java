package com.zhongger.zmail.product.web;

import com.zhongger.zmail.product.service.SkuInfoService;
import com.zhongger.zmail.product.vo.SkuItemVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ItemController {
    @Autowired
    private SkuInfoService skuInfoService;

    @GetMapping("/{skuId}.html")
    public String skuItem(@PathVariable("skuId") Long skuId, Model model){
        System.out.println(skuId);
        SkuItemVo skuItemVo = skuInfoService.item(skuId);
        System.out.println(skuItemVo);
        model.addAttribute("item", skuItemVo);
        return "item";
    }
}
