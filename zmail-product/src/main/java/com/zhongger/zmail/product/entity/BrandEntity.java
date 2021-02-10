package com.zhongger.zmail.product.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zhongger.zmail.common.valid.AddGroup;
import com.zhongger.zmail.common.valid.ListValue;
import com.zhongger.zmail.common.valid.UpdateGroup;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import java.io.Serializable;

/**
 * 品牌
 *
 * @author leifengyang
 * @email leifengyang@gmail.com
 * @date 2019-10-01 21:08:49
 */
@Data
@TableName("pms_brand")
public class BrandEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 品牌id
     */
    @NotNull(message = "修改必须指定品牌id", groups = {UpdateGroup.class})
    @Null(message = "新增不能指定id", groups = {AddGroup.class})
    @TableId
    private Long brandId;
    /**
     * 品牌名
     */
    @NotBlank(message = "品牌名必须提交", groups = {UpdateGroup.class, AddGroup.class})
    private String name;
    /**
     * 品牌logo地址
     */
    @NotNull(groups = {UpdateGroup.class, AddGroup.class})
    private String logo;
    /**
     * 介绍
     */
    private String descript;
    /**
     * 显示状态[0-不显示；1-显示]
     */
//	@Pattern()
    @ListValue(vals = {0, 1}, groups = {AddGroup.class})
    private Integer showStatus;
    /**
     * 检索首字母
     */

    private String firstLetter;
    /**
     * 排序
     */

    private Integer sort;

}
