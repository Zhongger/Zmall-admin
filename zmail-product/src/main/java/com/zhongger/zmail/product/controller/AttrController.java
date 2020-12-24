package com.zhongger.zmail.product.controller;

import com.zhongger.zmail.common.utils.PageUtils;
import com.zhongger.zmail.common.utils.R;
import com.zhongger.zmail.product.entity.ProductAttrValueEntity;
import com.zhongger.zmail.product.service.AttrService;
import com.zhongger.zmail.product.service.ProductAttrValueService;
import com.zhongger.zmail.product.vo.AttrRespVo;
import com.zhongger.zmail.product.vo.AttrVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;


/**
 * 商品属性
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-01 22:50:32
 */
@RestController
@RequestMapping("product/attr")
public class AttrController {
    @Autowired
    private AttrService attrService;

    @Autowired
    ProductAttrValueService productAttrValueService;

    @GetMapping("/base/listforspu/{spuId}")
    public R baseAttrlistforspu(@PathVariable("spuId") Long spuId){

        List<ProductAttrValueEntity> entities = productAttrValueService.baseAttrlistforspu(spuId);

        return R.ok().put("data",entities);
    }

    @RequestMapping("/save")
    public R save(@RequestBody AttrVo attrVo) {
        attrService.saveAttr(attrVo);
        return R.ok();
    }

    @RequestMapping("/update")
    public R update(@RequestBody AttrVo attrVo) {
        attrService.updateAttr(attrVo);
        return R.ok();
    }

    @PostMapping("/update/{spuId}")
    public R updateSpuAttr(@PathVariable("spuId") Long spuId,
                           @RequestBody List<ProductAttrValueEntity> entities){

        productAttrValueService.updateSpuAttr(spuId,entities);

        return R.ok();
    }

    @GetMapping("/sale/list/{catalogId}")
    public R saleList(@RequestParam Map<String, Object> params, @PathVariable("catalogId") Long catelogId) {
        PageUtils page = attrService.queryBaseAttrPage(params, catelogId, "sale");
        return R.ok().put("page", page);
    }

    @GetMapping("/{attrType}/list/{catalogId}")
    public R baseAttrList(@RequestParam Map<String, Object> params,
                          @PathVariable("catalogId") Long catelogId,
                          @PathVariable("attrType") String type) {
        PageUtils page = attrService.queryBaseAttrPage(params, catelogId, type);
        return R.ok().put("page", page);
    }

//    @GetMapping("/base/list/{catelogId}")
//    public R baseAttrList(@RequestParam Map<String,Object> params,
//                          @PathVariable("catelogId")Long catelogId){
//        PageUtils page =  attrService.queryBaseAttrPage(params,catelogId, type);
//        return R.ok().put("page", page);
//    }


    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("product:attr:list")
    public R list(@RequestParam Map<String, Object> params) {
        PageUtils page = attrService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("product:attr:delete")
    public R delete(@RequestBody Long[] attrIds) {
        attrService.removeByIds(Arrays.asList(attrIds));

        return R.ok();
    }

    @RequestMapping("/info/{attrId}")
    public R info(@PathVariable("attrId") Long attrId) {
        AttrRespVo attrRespVo = attrService.getAttrInfo(attrId);
        return R.ok().put("attr", attrRespVo);
    }


}
