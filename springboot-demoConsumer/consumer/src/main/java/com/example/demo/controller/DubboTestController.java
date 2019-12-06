package com.example.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.example.demo.service.DubboTestConsumerService;
import com.example.demo.service.IDubboTestConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class DubboTestController {

    @Autowired
    IDubboTestConsumerService dubboTestConsumerService;
    @RequestMapping(value = "/test")
    @ResponseBody
    public String dubboTest(int i ){
        System.out.println("main:"+Thread.currentThread().getName());
       int n = dubboTestConsumerService.dubboTestConsumer(i);
        System.out.println("sssdd");
        return String.valueOf(n);
    }
}
