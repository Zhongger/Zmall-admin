package com.zhongger.zmail.product.entity;


import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

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

	@TableId
	private Long brandId;
	/**
	 * 品牌名
	 */

	private String name;
	/**
	 * 品牌logo地址
	 */

	private String logo;
	/**
	 * 介绍
	 */
	private String descript;
	/**
	 * 显示状态[0-不显示；1-显示]
	 */
//	@Pattern()

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
