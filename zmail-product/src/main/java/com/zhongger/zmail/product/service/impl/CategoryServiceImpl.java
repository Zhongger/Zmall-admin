package com.zhongger.zmail.product.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhongger.zmail.common.utils.PageUtils;
import com.zhongger.zmail.common.utils.Query;
import com.zhongger.zmail.product.dao.CategoryDao;
import com.zhongger.zmail.product.entity.CategoryEntity;
import com.zhongger.zmail.product.service.CategoryBrandRelationService;
import com.zhongger.zmail.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

//    @Autowired
//    CategoryDao categoryDao;

    @Autowired
    CategoryBrandRelationService categoryBrandRelationService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listTree() {
        //1.查出所有的数据
        List<CategoryEntity> list = baseMapper.selectList(null);//查询所有的分类
        //2.组装成父子结构
        //2.1找到所有的一级分类
        List<CategoryEntity> level1 = list.stream().filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildren(categoryEntity,list));
                    return categoryEntity;
                }).sorted((m1,m2)-> {
                    return (m1.getSort() == null ? 0 : m1.getSort()) - (m2.getSort() == null ? 0 : m2.getSort());
                }).collect(Collectors.toList());
        return level1;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root , List<CategoryEntity> all){
        return all.stream().filter(categoryEntity -> categoryEntity.getParentCid()==root.getCatId()).map(categoryEntity -> {
            categoryEntity.setChildren(getChildren(categoryEntity,all));
            return categoryEntity;
        }).sorted((m1,m2)->{
           return (m1.getSort()==null?0:m1.getSort())-(m2.getSort()==null?0:m2.getSort());
        })
                .collect(Collectors.toList());
    }
}