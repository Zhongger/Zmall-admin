package com.zhongger.zmail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhongger.zmail.common.utils.PageUtils;
import com.zhongger.zmail.product.entity.Catalog2Vo;
import com.zhongger.zmail.product.entity.CategoryEntity;


import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-01 21:08:48
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);


    List<CategoryEntity> listTree();

    void removeMenuByIds(List<Long> ids);

    void updateCascade(CategoryEntity category);

    /**
     * 找到catelogId的完整路径；
     * [父/子/孙]
     *
     * @param catelogId
     * @return
     */
    Long[] findCatelogPath(Long catelogId);

    List<CategoryEntity> getLevel1Catagories();

    Map<String, List<Catalog2Vo>> getCatalogJsonDbWithSpringCache();

}

