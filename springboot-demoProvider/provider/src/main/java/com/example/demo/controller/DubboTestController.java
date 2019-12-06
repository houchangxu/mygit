package com.example.demo.controller;

import com.example.demo.service.DubboProviderTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/test")
public class DubboTestController {

    @Autowired
    DubboProviderTestService dubboTestService;
    @RequestMapping(value = "/test")
    @ResponseBody
    public String dubboTest(Integer t ){
        int i = dubboTestService.dubboTest(t);
        System.out.println("sssdd");
        return String.valueOf(i);
    }
}
