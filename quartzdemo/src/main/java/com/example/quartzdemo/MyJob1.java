package com.example.quartzdemo;

import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author hx1999
 * @Date 2020/7/1
 */
@Component
public class MyJob1 {

    public void sayHello(){
        System.out.println("MyJob1>>>"+new Date());
    }
}
