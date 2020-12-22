package com.zhongger.zmail.product.vo;

import com.zhongger.zmail.product.entity.AttrEntity;
import com.zhongger.zmail.product.entity.AttrGroupEntity;

import java.util.List;

public class AttrGroupWithAttrsVo extends AttrGroupEntity {
    private List<AttrEntity> attrs;

    public List<AttrEntity> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<AttrEntity> attrs) {
        this.attrs = attrs;
    }
}
