package com.example.demo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/*

*/
//cpu飙升？
@Service(interfaceClass = IDubboTestConsumerService.class, timeout = 180000)
@Component
public class DubboTestConsumerService implements IDubboTestConsumerService{

    @Reference(check = true,interfaceClass = IDubboProviderTestService.class)
    private IDubboProviderTestService iDubboProviderTestService;
    @Override
    public int dubboTestConsumer(int i ){

        int n = iDubboProviderTestService.dubboTest(i);
        System.out.println(n);
        return n;
    }

    static {
        Thread t = new Thread(new Runner());
        t.start();
    }

    static class Runner implements Runnable{

        @Override
        public void run() {
            while (true){
                System.out.println(1);
            }
        }
    }
}
