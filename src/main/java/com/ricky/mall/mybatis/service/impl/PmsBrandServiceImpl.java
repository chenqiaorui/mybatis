package com.ricky.mall.mybatis.service.impl;

import com.ricky.mall.mybatis.mapper.PmsBrandMapper;
import com.ricky.mall.mybatis.model.PmsBrand;
import com.ricky.mall.mybatis.model.PmsBrandExample;
import com.ricky.mall.mybatis.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// @Service用于标注服务层组件，
// 如果不使用会使得@Autowired  PmsBrandService时候报`Consider defining a bean of type`错误
@Service
public class PmsBrandServiceImpl implements PmsBrandService {
    // 实现对数据库对操作
    @Autowired
    PmsBrandMapper pmsBrandMapper;
    @Override
    public List<PmsBrand> listAllBrand() {
        return pmsBrandMapper.selectByExample(new PmsBrandExample());
    }
}
