package com.ajie;

import com.ajie.product.entity.BrandEntity;
import com.ajie.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AjiemallProductApplicationTests {

    @Autowired
    private BrandService brandService;


    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("huawei");

        brandService.save(brandEntity);
        System.out.println("保存成功");
    }



}
