package com.zhongger.zmail.product;

import com.zhongger.zmail.product.entity.BrandEntity;
import com.zhongger.zmail.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ZmailProductApplicationTests {

	@Autowired
	private BrandService brandService;
	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setDescript("你好啊");
		brandEntity.setName("华为");
		brandService.save(brandEntity);
		System.out.println("保存成功");
	}

}
