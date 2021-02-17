package com.zhongger.zmall.search.controller;

import com.zhongger.zmall.search.service.MallSearchService;
import com.zhongger.zmall.search.vo.SearchParam;
import com.zhongger.zmall.search.vo.SearchResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SearchController {
    @Autowired
    MallSearchService mallSearchService;

    @GetMapping("/search.html")
    public String searchIndex(SearchParam searchParam, Model model, HttpServletRequest request){
        searchParam.set_queryString(request.getQueryString());
        SearchResult result = mallSearchService.getSearchResult(searchParam);
        model.addAttribute("result",result);
        return "search";
    }
}
