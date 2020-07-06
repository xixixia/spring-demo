package com.example.mystarter;

import lombok.Data;

/**
 * @author hx1999
 * @Date 2020/7/1
 */
@Data
public class HelloService {

    private String name;
    private String msg;

    public String sayHello() {
        return name + " say " + msg;
    }

}
