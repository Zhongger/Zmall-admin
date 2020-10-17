package com.zhongger.zmail.product.controller;

import com.zhongger.zmail.common.utils.PageUtils;
import com.zhongger.zmail.common.utils.R;
import com.zhongger.zmail.product.entity.BrandEntity;
import com.zhongger.zmail.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


/**
 * 品牌
 */
@RestController
@RequestMapping("product/brand")
public class BrandController {
    @Autowired
    private BrandService brandService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:brand:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = brandService.queryPage(params);
        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{brandId}")
    //@RequiresPermissions("product:brand:info")
    public R info(@PathVariable("brandId") Long brandId) {
        BrandEntity brand = brandService.getById(brandId);

        return R.ok().put("brand", brand);
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:brand:delete")
    public R delete(@RequestBody Long[] brandIds) {
        brandService.removeByIds(Arrays.asList(brandIds));

        return R.ok();
    }

    @RequestMapping("/save")
    public R save(@Valid @RequestBody BrandEntity brandEntity, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            //1.获取校验异常的结果
            HashMap<String, String> map = new HashMap<>();
            bindingResult.getFieldErrors().forEach((item) -> {
                String defaultMessage = item.getDefaultMessage();
                String field = item.getField();
                ;
                map.put(field, defaultMessage);
            });
            return R.error(400, "提交的数据不合法").put("data", map);
        } else {
            brandService.save(brandEntity);
            return R.ok();
        }

    }

    @RequestMapping("/update")
    public R update(@RequestBody BrandEntity brandEntity) {
        brandService.updateById(brandEntity);
        return R.ok();
    }

    @RequestMapping("/update/status")
    public R updateStatus(@RequestBody BrandEntity brandEntity) {
        brandService.updateById(brandEntity);
        return R.ok();
    }

}
