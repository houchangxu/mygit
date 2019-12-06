package com.example.demo.service;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

@Service(interfaceClass = IDubboProviderTestService.class, timeout = 12000,retries = 1)
@Component
public class DubboProviderTestService implements IDubboProviderTestService {

    public int dubboTest(int i ){

        System.out.println(i);
        System.out.println(Thread.currentThread().getName());
        try {
//            this.wait();
            Thread.sleep(50000);
            System.out.println("sleep over");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return 2*i;
    }
}
