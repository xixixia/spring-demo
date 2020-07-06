package com.example.quartzdemo;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

/**
 * @author hx1999
 * @Date 2020/7/1
 */
//@Configuration
public class MyScheduling {

    @Scheduled(fixedRate = 2000)
    public void fixedRate(){
        System.out.println("fixedRate>>>"+new Date());
    }

    @Scheduled(fixedDelay = 2000)
    public void fixedDelay(){
        System.out.println("fixedDelay>>>"+new Date());
    }

    @Scheduled(initialDelay = 2000,fixedDelay = 2000)
    public void initialDelay(){
        System.out.println("initialDelay>>>"+new Date());
    }
}
