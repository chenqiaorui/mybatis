package com.ricky.mall.mybatis.controller;

import com.ricky.mall.mybatis.model.PmsBrand;
import com.ricky.mall.mybatis.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

// @Controller：用于定义控制器类，在spring项目中由控制器负责将用户发来的URL请求转发到对应的服务接口（service层），
// 一般这个注解在类中，通常方法需要配合注解@RequestMapping，
// 如果不使用，调用接口的时候会报There was an unexpected error (type=Not Found, status=404)错误
@Controller
public class PmsBrandController {

    @Autowired
    PmsBrandService demoService;

    // @RequestMapping("test")
    @RequestMapping(value = "test", method = RequestMethod.GET)
    // @ResponseBody:表示该方法的返回结果直接写入HTTP response body中，
    // 与@RequestMapping联用,如果不使用，
    // 返回的时候会报`Circular view path [listAll]: would dispatch back to the current handler URL [/test] again`
    @ResponseBody
    public String test() {
        return "ok";
    }

    @RequestMapping(value = "listAll", method = RequestMethod.GET)
    @ResponseBody
    public List<PmsBrand> getBrandList() {
        return demoService.listAllBrand();
    }

}
