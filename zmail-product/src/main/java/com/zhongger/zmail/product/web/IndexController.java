package com.zhongger.zmail.product.web;

import com.zhongger.zmail.product.entity.Catalog2Vo;
import com.zhongger.zmail.product.entity.CategoryEntity;
import com.zhongger.zmail.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class IndexController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping({"/", "index.html"})
    public String getIndex(Model model) {
        //获取所有的一级分类
        List<CategoryEntity> categorys = categoryService.getLevel1Catagories();
        model.addAttribute("categorys", categorys);
        return "index";
    }
    @ResponseBody
    @GetMapping("/index/catalog.json")
    public Map<String, List<Catalog2Vo>> getCategoryMap() {
        return categoryService.getCatalogJsonDbWithSpringCache();
    }

}
