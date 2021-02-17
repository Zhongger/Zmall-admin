package com.zhongger.zmall.search.service;

import com.zhongger.zmall.search.vo.SearchParam;
import com.zhongger.zmall.search.vo.SearchResult;

public interface MallSearchService {
    SearchResult getSearchResult(SearchParam searchParam);
}
